package com.xihua.spring_JdbcTemplate.service;

import com.xihua.spring_JdbcTemplate.dao.BookDaoImpl;
import com.xihua.spring_JdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/1/10:48
 **/

@Service
public class BookService {
    @Autowired
    BookDaoImpl bookDao;

    //添加
    public void addUser(User user){
        bookDao.add(user);
    }

}
