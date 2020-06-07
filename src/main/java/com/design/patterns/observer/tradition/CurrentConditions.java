package com.design.patterns.observer.tradition;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:14
 * @Description: 气第三方接口
 */
public class CurrentConditions {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("今天温度: " + temperature);
        System.out.println("今天气压: " + pressure);
        System.out.println("今天湿度: " + humidity);
    }
}

