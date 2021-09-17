package com.assessment.service;

import com.assessment.pojo.User;

import java.util.List;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-15 13:45
 */
public interface UserService {

    //查询是否有当前用户
    public boolean queryUsernameIsExist(String username);
    //保存用户信息(添加用户)
    public void saveUser(User user) throws Exception;
    //根据用户名查询用户信息
    public User queryUserByUsername(String username);
    //查询未认证用户列表信息
    public List<User> queryUserListByStatus(Integer status);
    //修改用户信息
    void updateUser(User user);

    //根据用户id查询用户信息
    public User queryUserByUserId(String id);
}
