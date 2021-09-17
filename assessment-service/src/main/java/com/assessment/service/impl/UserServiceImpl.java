package com.assessment.service.impl;

import com.assessment.mapper.UserMapper;
import com.assessment.pojo.User;
import com.assessment.service.UserService;
import com.assessment.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-15 13:46
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectOne(user) == null?false:true;//false:用户名未注册  true:用户名已经注册
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveUser(User user) throws Exception {
        String userid = sid.nextShort();
        user.setId(userid);
        user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
        userMapper.insert(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User queryUserByUsername(String username){
        User user = new User();
        user.setUsername(username);
        return userMapper.selectOne(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> queryUserListByStatus(Integer status) {
        User user = new User();
        user.setStatus(status);
        List<User> list = userMapper.select(user);
        for (User user1:list){
            user1.setPassword("");
        }
        return list;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public User queryUserByUserId(String id){
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }
}
