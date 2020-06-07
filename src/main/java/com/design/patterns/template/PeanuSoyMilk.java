package com.design.patterns.template;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 14:39
 * @Description:
 */
public class PeanuSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}