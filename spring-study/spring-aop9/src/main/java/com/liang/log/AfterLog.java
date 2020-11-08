package com.liang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue: 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
    }
}
