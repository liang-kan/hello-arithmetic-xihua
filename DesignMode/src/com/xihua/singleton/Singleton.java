package com.xihua.singleton;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/27/16:58
 *
 * 饿汉式（静态变量）
 **/

public class Singleton {

    /*构造器私有化，外部不能new*/
    private Singleton(){}

    //通过本类创建对象实例化
    private final static Singleton instance = new Singleton();

    //提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }


}
