package com.design.patterns.decorator.danping;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:32
 * @Description: 单品咖啡
 */
public class Coffee extends Drink {
    //无参构造
    public Coffee(){}
    @Override
    public float cost() {
        return super.getPrice();
    }


}