package com.design.patterns.factory.abstractfactory.order;

import com.design.patterns.factory.abstractfactory.pizza.BJCheesePizza;
import com.design.patterns.factory.abstractfactory.pizza.BJPepperPizza;
import com.design.patterns.factory.abstractfactory.pizza.Pizza;

/**
 * @Classname BJFactory
 * @Description TODO
 * @Date 2020/3/14 17:20
 * @Created by yang
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
