package com.xihua.spring_aop;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/31/14:03
 **/

public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        return a+b;
    }

    public String update(String id) {

        return id;
    }
}