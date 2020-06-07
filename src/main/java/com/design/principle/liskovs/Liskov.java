package com.design.principle.liskovs;

import java.sql.SQLOutput;

/**
 * @author yanghang
 * @date 2020/1/23 20:01
 * @description 历里氏替换原则
 */
public class Liskov {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("10-3="+a.func1(10,3));
        B b= new B();
        System.out.println("10-3="+b.func1(10,3));

    }
}

//A类
class A{
    public int func1(int num1 ,int num2){
        return num1-num2;
    }
}

//B类
class B extends A{
    @Override
    public int func1(int a, int b){
        return a+b;
    }

    public int func2(int a ,int b){
        return func1(a,b)+9;
    }

}


