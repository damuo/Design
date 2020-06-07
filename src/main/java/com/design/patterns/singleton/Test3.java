package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 20:40
 * @description 懒汉式：线程不安全
 */
public class Test3 {
    public static void main(String[] args) {
         Singleton3 singleton = Singleton3.getInstance();
         Singleton3 singleton1 = Singleton3.getInstance();
         System.out.println(singleton==singleton1);
     }
 }
class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

 }