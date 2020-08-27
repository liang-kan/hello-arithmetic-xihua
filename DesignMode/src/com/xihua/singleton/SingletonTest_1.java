package com.xihua.singleton;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/27/16:57
 * 单例
 **/

public class SingletonTest_1 {
    public static void main(String[] args) {

        //测试
        Singleton instance1 = Singleton.getInstance();


        Singleton instance2 = Singleton.getInstance();


        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println("------------------------------------");

        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance3 = Singleton1.getInstance();

        System.out.println(instance == instance3);

        System.out.println(instance.hashCode());
        System.out.println(instance3.hashCode());

    }
}

