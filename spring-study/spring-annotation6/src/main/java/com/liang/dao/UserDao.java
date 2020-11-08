package com.liang.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Repository
public class UserDao {
    public void selectAll(){
        System.out.println("查找所有的用户。");
    }
}
