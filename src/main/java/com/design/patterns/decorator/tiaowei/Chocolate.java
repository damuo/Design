package com.design.patterns.decorator.tiaowei;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:44
 * @Description:
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}