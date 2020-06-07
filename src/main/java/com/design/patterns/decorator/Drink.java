package com.design.patterns.decorator;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:29
 * @Description: 饮料抽象类
 */
public abstract class Drink {
    //描述
    public String des;
    //价格
    private float price=0.0f;
    //无参构造
    public  Drink(){}
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法,由子类实现
    public abstract float cost();
}