package com.design.patterns.factory.abstractfactory.order;


import com.design.patterns.factory.abstractfactory.pizza.Pizza;

/**
 * @Classname AbsFactory
 * @Description 抽象工厂模式抽象层
 * @Date 2020/3/14 17:16
 * @Created by yang
 */
public interface AbsFactory {
     Pizza createPizza(String orderType);
}
