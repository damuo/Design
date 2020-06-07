package com.design.patterns.observer.tradition;

import lombok.Data;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:15
 * @Description: 核心类(气象站提供实时天气信息)
 *   1. 包含最新的天气情况信息
 *   2. 含有 CurrentConditions 对象
 *   3. 当数据有更新时，就主动的调用   CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 */
@Data
public class WeatherData {
    // 温度，气压，湿度
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    //加入新的第三方
    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }
    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }
    //调用气象站天气更新
    public void dataChange() {
        //调用 接入方的 update
        currentConditions.update(getTemperatrue(), getPressure(), getHumidity());
    }
}