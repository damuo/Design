package com.design.patterns.template;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 14:53
 * @Description: 纯豆浆；钩子方法
 */
public class pureSoyaMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("纯豆浆");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}