package com.design.patterns.strategy.improve.action.fly;

import com.design.patterns.strategy.improve.action.FlyBehavior;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:05
 * @Description:
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 不会飞翔  ");
    }
}