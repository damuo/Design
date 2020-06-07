package com.design.patterns.decorator.tiaowei;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:45
 * @Description:
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(5.0f);
    }
}