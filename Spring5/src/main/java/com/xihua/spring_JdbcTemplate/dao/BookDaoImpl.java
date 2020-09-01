package com.xihua.spring_JdbcTemplate.dao;

import com.xihua.spring_JdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/1/10:48
 **/
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void add(User user) {

        String sql = "insert into user values(?,?,?,?,?)";
        Object [] args ={};
        int update = jdbcTemplate.update(sql, user.getUid(), user.getUsername(), user.getPassword(), user.getTel(), user.getAddr());
        System.out.println(update);
    }
}
