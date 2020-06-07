package com.design.patterns.observer.improve.website;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:57
 * @Description: 观察者接口，有观察者来实现
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}