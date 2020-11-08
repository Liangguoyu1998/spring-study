package com.liang.service;

import com.liang.dao.UserDao;
import com.liang.dao.UserDaoImpl;
import com.liang.dao.UserDaoMySqlImpl;
import com.liang.dao.UserDaoOracleImpl;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMySqlImpl();
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
