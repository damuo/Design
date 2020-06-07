package com.design.patterns.decorator.tiaowei;

import com.design.patterns.decorator.Drink;

/**
 * @Auther: 杨航
 * @Date: 2020/3/15 00:37
 * @Description: 调味品
 */
public class Decorator extends Drink {
    //聚合原则(单体咖啡信息)
    private Drink obj;
    //构造器
    public Decorator(Drink obj){
        this.obj=obj;
    }
    public Decorator(){}
    /**
     * 重写价格
     * @return
     */
    @Override
    public float cost() {
        //单体咖啡价格+调味品自身价格
        return super.getPrice()+obj.cost();
    }
    /**
     * 重写描述
     */
    @Override
    public String getDes() {
        //supper:调料品 obj:被封装者
        return super.des+""+super.getPrice()+"&&"+obj.getDes();
    }
}