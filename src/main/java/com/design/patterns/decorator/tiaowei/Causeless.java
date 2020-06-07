package com.design.patterns.decorator.tiaowei;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 01:49
 * @Description: 无因
 */
public class Causeless extends Decorator {
    public Causeless(Drink obj){
        super(obj);
        setDes("无因");
        setPrice(8.0f);
    }
}