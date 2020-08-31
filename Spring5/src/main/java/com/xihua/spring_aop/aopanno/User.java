package com.xihua.spring_aop.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/31/14:55
 **/

@Component

public class User {

    //被增强的方法：切入点
    public void add(){
        System.out.println("被增强的方法");
    }
}
