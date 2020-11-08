package com.liang.reflect;

import java.lang.reflect.*;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        User user = new User(1,"小明");
        Class<User> userClass = User.class; //类名.class得到Class<类名>对象;
        Class<?> classType = Class.forName("com.liang.reflect.User");//用Class.forName("全限定类名");
        //通过反射生成新的对象
        User user1 = userClass.newInstance();
        System.out.println(user1);
        Object o1 = classType.newInstance();
        System.out.println(o1);
        Method[] declaredMethods = classType.getDeclaredMethods();
        System.out.println("User类中定义的方法(不包括构造方法)：");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        Field[] declaredFields = classType.getDeclaredFields();
        System.out.println("User类中定义的属性：");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Constructor<?>[] constructors = classType.getConstructors();
        System.out.println("User类中的构造方法：");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //定义一个数组
        User[] users = new User[10];
        users[1] = user;
        Object o = Array.get(users, 1);
        System.out.println(o);
        System.out.println("======================================");
        System.out.println("通过反射为user1的id,name赋值：");
        //得到一个方法
        Method method1 = userClass.getDeclaredMethod("setId", new Class[]{int.class});
        //用反射来执行方法
        method1.invoke(user1,new Object[]{2});
        //得到另外一个方法
        Method method2 = userClass.getDeclaredMethod("setName",new Class[]{String.class});
        method2.invoke(user1,new Object[]{"小巧"});
        System.out.println(user1);
        Method method3 = userClass.getDeclaredMethod("toString",null);
        System.out.println(method3);
        //method3.setAccessible(true);
        System.out.println("=====================================");
        Object invoke = method3.invoke(user1, null);
        System.out.println(invoke);
    }
}
