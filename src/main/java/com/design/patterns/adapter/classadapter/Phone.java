package com.design.patterns.adapter.classadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 22:54
 * @Description: 手机充电类
 */
public class Phone {
    /**
     * 充电
     */
    public void chargin(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5) {
            System.out.println("适配完成，电压为5V可以充电！");
        }else{
            System.out.println("电压为非5V，不可以充电！");
        }
    }
}