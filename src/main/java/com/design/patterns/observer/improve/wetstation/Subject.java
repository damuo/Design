package com.design.patterns.observer.improve.wetstation;

import com.design.patterns.observer.improve.website.Observer;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 16:56
 * @Description: 接口, 让气象站来实现
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}