package com.design.patterns.strategy.improve.ducks;

import com.design.patterns.strategy.improve.action.FlyBehavior;
import com.design.patterns.strategy.improve.action.QuackBehavior;
import lombok.Data;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:05
 * @Description: 抽象父类:用于聚合各种策略属性
 */
@Data
public abstract class Duck {
    //属性, 策略接口
    protected FlyBehavior flyBehavior;
    //其它属性<->策略接口
    protected QuackBehavior quackBehavior;

    public abstract void display();//显示鸭子信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {
        //改进
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}