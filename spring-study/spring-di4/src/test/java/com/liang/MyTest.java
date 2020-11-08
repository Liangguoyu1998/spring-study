package com.liang;

import com.liang.pojo.Student;
import com.liang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);
        //System.out.println(student.getName());
    }
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2);
        User user3 = (User)applicationContext.getBean("user1");
        //bean的作用域可以为singleton,prototype,request,session,application
        System.out.println("user1 == user3?"+(user1 == user3));
        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());
    }

}
