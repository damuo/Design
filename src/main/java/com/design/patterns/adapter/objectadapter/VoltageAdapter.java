package com.design.patterns.adapter.objectadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 22:51
 * @Description: 适配器类
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V v){
        this.voltage220V=v;
    }
    @Override
    public int output5V() {
        int dstV=0;
        if(null != voltage220V){
            int srcV=voltage220V.output220V();
            System.out.println("对象适配器转换......");
            dstV=srcV/44;
        }
        return dstV;
    }
}