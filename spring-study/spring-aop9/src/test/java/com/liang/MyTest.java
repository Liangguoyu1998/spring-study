package com.liang;

import com.liang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //这里要用接口接收，不能用实现类，否则会报错
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //System.out.println(userService);
        userService.delete();
    }
}
