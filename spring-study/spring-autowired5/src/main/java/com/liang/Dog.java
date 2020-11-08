package com.liang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Component(value = "dog1")
public class Dog {
    @Value("旺财")
    private String name;
    public void shout(){
        System.out.println("汪汪汪");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
