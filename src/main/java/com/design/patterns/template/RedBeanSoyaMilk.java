package com.design.patterns.template;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 14:37
 * @Description: 红豆豆浆
 */
public class RedBeanSoyaMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好红豆");
    }
}