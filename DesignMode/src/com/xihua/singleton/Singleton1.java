package com.xihua.singleton;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/27/16:58
 *
 * 饿汉式（静态代码块）
 **/

public class Singleton1 {

    /*构造器私有化，外部不能new*/
    private Singleton1(){}

    //通过本类创建对象实例化
    private static Singleton1 instance = new Singleton1();

    static {
         instance = new Singleton1();
    }

    //提供一个共有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }


}
