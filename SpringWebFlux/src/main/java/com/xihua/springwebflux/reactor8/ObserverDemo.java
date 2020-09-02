package com.xihua.springwebflux.reactor8;

import java.util.Observable;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/2/11:45
 **/

public class ObserverDemo  extends Observable {

    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        //添加一个观察者对象
        observerDemo.addObserver((o,arg)->{
            System.out.println("风情：这是一个观察者");
        });

        observerDemo.addObserver((o,arg)->{
            System.out.println("西华：收到观察者通知，准备改变2");
        });
        observerDemo.addObserver((o,arg)->{
            System.out.println("西华：收到观察者通知，准备改变1");
        });
        observerDemo.addObserver((o,arg)->{
            System.out.println("风情：收到观察者通知，准备改变");
        });

        //监控数据变化
        observerDemo.setChanged();

        //通知全部
        observerDemo.notifyObservers();
    }
}
