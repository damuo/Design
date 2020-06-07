package com.design.patterns.adapter.objectadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 23:00
 * @Description: 手机连接
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");
        Phone phone=new Phone();
        //电压类
        Voltage220V voltage220V = new Voltage220V();
        //聚合
        VoltageAdapter voltageAdapter = new VoltageAdapter(voltage220V);
        //手机通过适配器充电
        phone.chargin(voltageAdapter);

    }
}