package com.liang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Component
@Scope("singleton") //prototype
public class User {
    @Value("1")
    private int id;
    @Value("小明")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

