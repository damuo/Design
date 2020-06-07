package com.design.patterns.template;

/**
 * @Auther: 杨航
 * @Date: 2020/3/17 14:32
 * @Description: 抽象模板方法类
 */
public abstract  class SoyMilk {
    //模板方法
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
            soak();
        }
        beat();
    }
    //钩子方法
    boolean customerWantCondiments(){
        return true;
    }
    //选材料
    void select(){
        System.out.println("第一步，选择新鲜黄豆");
    }
    //添加不同配料
    abstract void addCondiments();
    //浸泡
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡3小时");
    }
    //打豆浆
    void beat(){
        System.out.println("第四步，放入豆浆机打碎");
    }
}