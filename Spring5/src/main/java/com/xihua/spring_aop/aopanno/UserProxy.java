package com.xihua.spring_aop.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/31/14:56
 * 增强类
 **/

@Component
@Aspect
public class UserProxy {

    //抽取公共的增强方法
    @Pointcut(value = "execution(* com.xihua.spring_aop.aopanno.User.add())")
    public void pointdemo(){

    }


    //前置通知
    @Before(value = "execution(* com.xihua.spring_aop.aopanno.User.add(..))")
    public void before(){
        System.out.println("之前通知");
    }

    @After(value = "execution(* com.xihua.spring_aop.aopanno.User.add(..))")
    public void after(){
        System.out.println("after,...");
    }

    @AfterReturning(value = "execution(* com.xihua.spring_aop.aopanno.User.add(..))")
    public void afterRet(){
        System.out.println("AfterReturning,...");
    }

    @AfterThrowing(value = "execution(* com.xihua.spring_aop.aopanno.User.add(..))")
    public void throwing(){
        System.out.println("throwing,...");
    }

    @Around(value = "execution(* com.xihua.spring_aop.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint pro) throws Throwable {

        System.out.println("around之前,...");

        pro.proceed();
        System.out.println("around之前,...");
    }

}
