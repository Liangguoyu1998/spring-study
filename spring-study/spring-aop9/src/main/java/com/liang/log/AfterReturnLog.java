package com.liang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class AfterReturnLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValues, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法执行后，有返回值。");
    }
}
