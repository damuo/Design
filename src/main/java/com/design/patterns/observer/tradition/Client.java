package com.design.patterns.observer.tradition;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:18
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建接气象站
        CurrentConditions currentConditions = new CurrentConditions();
        //创建天气更新并将气象站传入
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        System.out.println("============昨日天气=============");
        weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);
    }
}