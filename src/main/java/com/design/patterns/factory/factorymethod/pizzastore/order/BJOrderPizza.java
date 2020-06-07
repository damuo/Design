package com.design.patterns.factory.factorymethod.pizzastore.order;

import com.design.patterns.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.design.patterns.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.design.patterns.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    public BJOrderPizza() {
        System.out.println("================>2");
    }
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
