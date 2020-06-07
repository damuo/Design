package com.design.patterns.strategy.improve.ducks.different;

import com.design.patterns.strategy.improve.action.fly.BadFlyBehavior;
import com.design.patterns.strategy.improve.ducks.Duck;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:08
 * @Description: 北京鸭
 */
public class PekingDuck extends Duck {
    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }
}