package com.liang;

import com.liang.config.AppConfig;
import com.liang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //这里的getUser就是com.liang.config包下的AppConfig类中的一个方法名，该方法返回一个User对象
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
