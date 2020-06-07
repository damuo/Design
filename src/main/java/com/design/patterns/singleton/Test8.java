package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 22:10
 * @description 枚举
 */
public class Test8 {
    public static void main(String[] args) {
        Singleton8 singleton = Singleton8.INSTANCE;
        Singleton8 singleton1 = Singleton8.INSTANCE;
        System.out.println(singleton==singleton1);
    }
}

/**
 * 使用枚举，实现单例模式
 */
enum Singleton8{
    INSTANCE;
    public void sayOk(){
        System.out.println("OK");
    }
}
