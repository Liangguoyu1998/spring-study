package com.liang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
//方式三：使用注解方式实现AOP
@Aspect  //标注这个类是一个切面
public class AnnotationPointcut {
    @Before("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========开始执行前========");
    }
    @After("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后========");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //获得签名
        //Signature signature = proceedingJoinPoint.getSignature();
        //System.out.println(signature);
        //执行方法
        Object proceed = proceedingJoinPoint.proceed();
        //System.out.println(proceed);
        System.out.println("环绕后");
    }
}
