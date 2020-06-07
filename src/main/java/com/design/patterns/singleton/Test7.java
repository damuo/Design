package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 21:44
 * @description 静态内部类
 */
public class Test7 {
    public static void main(String[] args) {
        Singleton7 singleton = Singleton7.getInstance();
        Singleton7 singleton1 = Singleton7.getInstance();
        System.out.println(singleton==singleton1);
    }
}
class Singleton7 {
    private static volatile Singleton7 singleton7;
    //构造器私有化
    private Singleton7(){}

    //静态内部类，该类中有一个静态属性 Singleton
    private static class  Singleton {
        private static final Singleton7 SINGLETON_7=new Singleton7();
    }

    //静态共有方法，直接返回Singleton7
    public static synchronized Singleton7 getInstance(){
        return singleton7;
    }

}
