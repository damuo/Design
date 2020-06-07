package com.design.patterns.adapter.classadapter;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 22:51
 * @Description: 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220v电压
        int srcV=output220V();
        int dstV=srcV/44;
        return dstV;
    }
}