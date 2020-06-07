package com.design.patterns.adapter.classadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 22:51
 * @Description: 220v类
 */
public class Voltage220V {
    public int output220V(){
        int src=220;
        System.out.println("电压"+src+"伏");
        return src;
    }
}