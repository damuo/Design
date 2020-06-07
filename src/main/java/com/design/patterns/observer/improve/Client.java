package com.design.patterns.observer.improve;

import com.design.patterns.observer.improve.website.BaiduSite;
import com.design.patterns.observer.improve.website.CurrentConditions;
import com.design.patterns.observer.improve.wetstation.WeatherData;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 17:03
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        //查看两个网站实时信息
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);

        //移除一个观察者(网站)，并查看信息
        weatherData.removeObserver(currentConditions);
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}