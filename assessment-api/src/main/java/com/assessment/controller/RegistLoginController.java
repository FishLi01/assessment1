package com.assessment.controller;

import com.assessment.pojo.User;
import com.assessment.pojo.vo.UserVO;
import com.assessment.service.UserService;
import com.assessment.utils.IMoocJSONResult;
import com.assessment.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Date;
import java.util.UUID;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-15 11:15
 */
@RestController
@Api(value = "用户注册登录的接口",tags = {"注册登录的controller"})
public class RegistLoginController extends BasicController{
    @Autowired
    private UserService userService;

    public UserVO setUserRedisSessionToken(User user){
        String uniqueToken = UUID.randomUUID().toString();
        redis.set(USER_REDIS_SESSION+":"+user.getId(),uniqueToken,1000*60*30);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        userVO.setUserToken(uniqueToken);
        return userVO;
    }

    @ApiOperation(value = "注册接口",notes = "注册接口")
    @PostMapping("/regist")
    public IMoocJSONResult regist(@RequestBody User user) throws Exception {
        //1.判断用户信息是否为空
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword()) || user.getDepartment() == null || user.getRank() == null){
            return IMoocJSONResult.errorMsg("用户信息必填项不能为空!!!");
        }
        //2.判断当前用户名是否已存在
        Boolean usernameIsExist = userService.queryUsernameIsExist(user.getUsername());
        //3.保存用户,用户注册
        if (!usernameIsExist){//用户名未注册
            user.setStatus(0);
            user.setCreateTime(new Date());
            userService.saveUser(user);
        }else{//用户名已注册
            return IMoocJSONResult.errorMsg("用户名已经存在,请重新输入!!!");
        }
        user.setPassword("");

        UserVO userVO = setUserRedisSessionToken(user);
        return IMoocJSONResult.ok(userVO);
    }

    @ApiOperation(value = "用户登录",notes = "用户登录")
    @PostMapping("/login")
    public IMoocJSONResult login(@RequestBody User user) throws Exception {
        //0.判断用户是否已认证,并是启动状态
        User result = userService.queryUserByUsername(user.getUsername());
        if (result.getStatus() != 0){//已认证可以登录
            if (result.getStatus() != 2){
                return IMoocJSONResult.errorMsg("账号已禁用,请联系管理员启用账号!!!");
            }
        }else{//未认证不可登录
            return IMoocJSONResult.errorMsg("账号在认证中,请等待1-2天重新登录!!!");
        }

        //1.判断用户名和密码是否为空
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return IMoocJSONResult.errorMsg("用户名和密码不能为空!!!");
        }
        //2.判断是否有当前用户名
        Boolean usernameIsExist = userService.queryUsernameIsExist(user.getUsername());
        //3.登录
        if (!usernameIsExist){//没有当前用户名
            return IMoocJSONResult.errorMsg("用户名不存在请重新输入!!!");
        }else{
            System.out.println(result.getPassword());
            System.out.println("///////////////");
            System.out.println(MD5Utils.getMD5Str(user.getPassword()));
            if (result.getPassword() .equals(MD5Utils.getMD5Str(user.getPassword())) ){
                result.setPassword("");
                UserVO userVO = setUserRedisSessionToken(result);
                return IMoocJSONResult.ok(userVO);
            }else{
                return IMoocJSONResult.errorMsg("密码输入有误,请重新输入!!!");
            }
        }
    }

    @ApiOperation(value = "用户退出",notes = "用户退出")
    @ApiImplicitParam(value = "用户id",name = "userId",required = true,dataType = "String",paramType = "query")
    @PostMapping("/logout")
    public IMoocJSONResult logout(String userId){
        //1.判断当前用户是否已退出(超过30分钟)
        redis.del(USER_REDIS_SESSION+":"+userId);
        return IMoocJSONResult.ok();
    }
}
