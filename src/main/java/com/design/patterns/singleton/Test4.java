package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 21:19
 * @description 懒汉式:线程安全，同步方法
 */
public class Test4 {
    public static void main(String[] args) {
        Singleton4 singleton = Singleton4.getInstance();
        Singleton4 singleton1 = Singleton4.getInstance();
        System.out.println(singleton==singleton1);
    }
}
class Singleton4 {
    private static Singleton4 singleton4;
    private Singleton4(){}
    /**
     * 加入同步处理，解决线程安全问题
     */
    public static synchronized Singleton4 getInstance(){
        if (singleton4 == null) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }

}
