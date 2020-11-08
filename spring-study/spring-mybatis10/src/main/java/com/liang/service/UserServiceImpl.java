package com.liang.service;

import com.liang.mapper.UserMapper;
import com.liang.pojo.User;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public User selectById(int id) {
        return userMapper.selectById(id);
    }
}