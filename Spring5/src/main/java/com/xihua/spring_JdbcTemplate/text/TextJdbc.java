package com.xihua.spring_JdbcTemplate.text;

import com.xihua.spring_JdbcTemplate.entity.User;
import com.xihua.spring_JdbcTemplate.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/1/11:17
 **/

public class TextJdbc {

    @Test
    public void tersJdbcT(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        classPathXmlApplicationContext.getBean("bookService", BookService.class);

        BookService bookService = classPathXmlApplicationContext.getBean("bookService", BookService.class);

        User user = new User();

        //user.setUid(5);
        user.setUsername("liangxihua");
        user.setPassword("liangxiua");
        user.setTel("132132132132");
        user.setAddr("xian");

        bookService.addUser(user);

    }
}
