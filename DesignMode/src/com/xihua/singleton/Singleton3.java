package com.xihua.singleton;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/27/16:58
 *
 * 懒汉式（静态变量）
 * 多线程下不安全
 **/

public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3(){}

    //提供一个静态的公有方法，当使用到该方法时，才回去创建instance
    //加入sinchronized解决线程安全问题
    //懒汉式

    public static synchronized Singleton3 getInstance(){
        if (instance == null){
             instance = new Singleton3();

        }

        return instance;
    }

}
