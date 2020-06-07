package com.design.patterns.decorator.tiaowei;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:46
 * @Description:
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(6.0f);
    }
}