package com.design.patterns.factory.abstractfactory.order;


import com.design.patterns.factory.abstractfactory.pizza.LDCheesePizza;
import com.design.patterns.factory.abstractfactory.pizza.LDPepperPizza;
import com.design.patterns.factory.abstractfactory.pizza.Pizza;

/**
 * @Classname LDFactory
 * @Description TODO
 * @Date 2020/3/14 17:23
 * @Created by yang
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
