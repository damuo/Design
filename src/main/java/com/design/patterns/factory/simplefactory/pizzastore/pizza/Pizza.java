package com.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * @author yanghang
 * @date 2020/2/1 22:43
 * @description 准备材料 烘烤 切割 打包
 */
public abstract class Pizza {
    protected String name; //名字
    public void setName(String name) {
        this.name = name;
    }

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " 烘烤;");
    }
    //切割
    public void cut() {
        System.out.println(name + " 切割;");
    }

    //打包
    public void box() {
        System.out.println(name + " 打包;");
    }


}


