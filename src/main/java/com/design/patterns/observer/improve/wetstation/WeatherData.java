package com.design.patterns.observer.improve.wetstation;

import com.design.patterns.observer.improve.website.Observer;
import lombok.Data;

import java.util.ArrayList;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:59
 * @Description: 气象站
 */
@Data
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;
    //加入新的第三方
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    public void dataChange() {
        //调用接入方的 update
        notifyObservers();
    }
    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }
    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }
    //遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}