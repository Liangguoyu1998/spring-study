package com.liang.service;

import com.liang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void selectAll(){
        userDao.selectAll();
    }
}
