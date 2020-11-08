package com.liang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Component
public class Cat {
    @Value("翠花")
    private String name;
    public void shout(){
        System.out.println("喵喵喵");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
