package com.liang;

import com.liang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
        System.out.println("=============================================");
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2);
        System.out.println("=============================================");
        User user3 = applicationContext.getBean("user3", User.class);
        System.out.println(user3);
        System.out.println("=============================================");
        User user4 = applicationContext.getBean("I am user4", User.class);
        System.out.println(user4);
        System.out.println("=============================================");
    }
}
