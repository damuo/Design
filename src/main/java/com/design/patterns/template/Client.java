package com.design.patterns.template;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 14:40
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("=======================================");
        System.out.println("制作花生豆浆");
        PeanuSoyMilk peanuSoyMilk = new PeanuSoyMilk();
        peanuSoyMilk.make();
        System.out.println("=======================================");
        System.out.println("制作纯豆浆");
        pureSoyaMilk pureSoyaMilk = new pureSoyaMilk();
        pureSoyaMilk.make();
    }
}