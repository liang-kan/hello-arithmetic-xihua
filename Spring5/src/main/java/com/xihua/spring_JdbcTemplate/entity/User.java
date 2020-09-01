package com.xihua.spring_JdbcTemplate.entity;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/1/11:06
 **/

public class User {

    private Integer uid;

    private String username;

    private String password;

    private String tel;

    private String addr;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
