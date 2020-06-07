package com.design.patterns.strategy.improve.ducks.different;

import com.design.patterns.strategy.improve.action.fly.GoodFlyBehavior;
import com.design.patterns.strategy.improve.ducks.Duck;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:01
 * @Description: 野鸭
 */
public class WildDuck extends Duck {
    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}