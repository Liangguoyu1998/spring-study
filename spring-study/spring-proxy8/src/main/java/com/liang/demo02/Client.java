package com.liang.demo02;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
//静态代理
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserServiceImpl(userServiceImpl);
        userServiceProxy.select();
    }
}
