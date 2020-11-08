package com.liang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
        //可以使用注解进行自动装配

    }
}
