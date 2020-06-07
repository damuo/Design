package com.design.patterns.adapter.classadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 23:00
 * @Description: 手机连接
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");
        Phone phone=new Phone();
        //手机通过适配器充电
        phone.chargin(new VoltageAdapter());

    }
}