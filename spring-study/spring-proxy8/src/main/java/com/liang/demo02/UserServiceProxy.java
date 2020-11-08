package com.liang.demo02;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class UserServiceProxy implements UserService  {
    private UserServiceImpl userServiceImpl;
    public void setUserServiceImpl(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    public void update() {
        log("update");
        userServiceImpl.update();
    }

    public void select() {
        log("select");
        userServiceImpl.select();
    }
    public void log(String msg){
        System.out.println("[Debug]使用了"+msg+"方法");
    }
}
