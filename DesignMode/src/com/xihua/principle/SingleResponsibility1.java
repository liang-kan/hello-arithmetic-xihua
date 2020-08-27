package com.xihua.principle;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/27/10:13
 * 单一原则
 **/

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("飞机");
        vehicle.run("摩托车");
        vehicle.run("游艇");
        vehicle.run("共享单车");

        //违反了单一职责原则
        //应根据不同的交通方式分为多个类


    }




}
