package com.design.patterns.strategy.improve.ducks.different;

import com.design.patterns.strategy.improve.action.fly.NoFlyBehavior;
import com.design.patterns.strategy.improve.ducks.Duck;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:07
 * @Description: 玩具鸭
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}