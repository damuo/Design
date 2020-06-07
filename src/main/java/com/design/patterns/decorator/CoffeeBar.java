package com.design.patterns.decorator;

import com.design.patterns.decorator.danping.LongBack;
import com.design.patterns.decorator.tiaowei.Causeless;
import com.design.patterns.decorator.tiaowei.Chocolate;
import com.design.patterns.decorator.tiaowei.Milk;
import com.design.patterns.decorator.tiaowei.Soy;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:47
 * @Description: 咖啡店
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //1.点一份单体美式咖啡
        Drink longBack = new LongBack();
        System.out.println("咖啡费用==>"+longBack.cost());
        System.out.println("描述==>"+longBack.getDes());
        //2.加一份牛奶，装饰咖啡(即包含)
        longBack = new Milk(longBack);
        System.out.println("咖啡+牛奶费用==>"+longBack.cost());
        System.out.println("描述==>"+longBack.getDes());
        //3.加一份巧克力
        longBack=new Chocolate(longBack);
        System.out.println("咖啡+牛奶+巧克力费用==>"+longBack.cost());
        System.out.println("描述==>"+longBack.getDes());
        //4.加一份豆奶
        longBack=new Soy(longBack);
        System.out.println("咖啡+牛奶+巧克力费用==>"+longBack.cost());
        System.out.println("描述==>"+longBack.getDes());
        //5.加一份无因
        longBack=new Causeless(longBack);
        System.out.println("咖啡+牛奶+巧克力费用==>"+longBack.cost());
        System.out.println("描述==>"+longBack.getDes());
    }
}