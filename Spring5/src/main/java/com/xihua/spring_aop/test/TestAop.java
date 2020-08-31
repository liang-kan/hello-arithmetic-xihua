package com.xihua.spring_aop.test;

import com.xihua.spring_aop.aopanno.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/31/16:03
 **/


public class TestAop {

    @Test
   public void testAopAnno(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");

        User user = classPathXmlApplicationContext.getBean("User", User.class);

        user.add();
    }
}
