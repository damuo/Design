package com.design.patterns.strategy.improve;

import com.design.patterns.strategy.improve.action.fly.NoFlyBehavior;
import com.design.patterns.strategy.improve.ducks.different.PekingDuck;
import com.design.patterns.strategy.improve.ducks.different.ToyDuck;
import com.design.patterns.strategy.improve.ducks.different.WildDuck;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 18:11
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //野鸭子
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();//

        //玩具鸭
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        //北京鸭
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();
    }
}