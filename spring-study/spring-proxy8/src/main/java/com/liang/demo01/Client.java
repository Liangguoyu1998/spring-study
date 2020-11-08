package com.liang.demo01;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介帮房东租房子，但是呢？代理角色一般会做一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
