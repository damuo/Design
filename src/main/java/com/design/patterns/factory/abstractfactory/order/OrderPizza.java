package com.design.patterns.factory.abstractfactory.order;

import com.design.patterns.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory;
    //构造器
    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }
    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza=null;
        String orderType="";
        //factory由子类指定传参
        this.absFactory=absFactory;
        do {
            orderType = getType();
            //自动向下转型
            pizza = absFactory.createPizza(orderType); //抽象方法，由工厂子类完成
            //输出pizza 制作过程
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
