package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 21:33
 * @description 双重检查
 */
public class Test6 {
    public static void main(String[] args) {
        Singleton6 singleton = Singleton6.getInstance();
        Singleton6 singleton1 = Singleton6.getInstance();
        System.out.println(singleton==singleton1);
    }
}
class Singleton6 {
    private static volatile Singleton6 singleton6;
    private Singleton6(){}
    /**
     * 提供一个静态的共有方法，加入双重检查，解决线程安全问题|懒加载问题|保证效率
     */
    public static  Singleton6 getInstance(){
        if (singleton6 == null) {
            synchronized(Singleton6.class){
                if (singleton6 == null) {
                    singleton6= new Singleton6();
                }
            }
        }
        return singleton6;
    }

}