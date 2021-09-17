package com.assessment.controller;

import com.assessment.pojo.User;
import com.assessment.service.UserService;
import com.assessment.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-17 9:31
 */
@Api(value = "用户信息业务操作的接口",tags = "用户信息的controller")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "未认证用户列表接口",notes = "未认证用户列表的接口")
    @PostMapping("/usersStatus")
    public IMoocJSONResult usersStatus(){
        List<User> list = userService.queryUserListByStatus(0);
        return IMoocJSONResult.ok(list);
    }

    @ApiOperation(value = "修改用户信息接口",notes = "修改用户信息的接口")
    @PostMapping("/updateUser")
    public IMoocJSONResult updateUser(@RequestBody User user){
        User user1 = userService.queryUserByUserId(user.getId());
        user1.setStatus(user.getStatus());
        userService.updateUser(user1);
        return IMoocJSONResult.ok();
    }
}
