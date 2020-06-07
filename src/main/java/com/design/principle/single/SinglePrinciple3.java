package com.design.principle.single;

/**
 * @author yanghang
 * @date 2020/1/23 9:33
 * @description 在方法级别上遵循单一职责原则
 */
public class SinglePrinciple3 {
    public static void main(String[] args) {
        Vehicle2 singlePrinciple2 = new Vehicle2();
        singlePrinciple2.run("汽车");
        singlePrinciple2.runAir("歼20");
        singlePrinciple2.runWat("军舰");
    }

}

class Vehicle2{
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上驰骋!");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle+"在天空飞行!");
    }
    public void runWat(String vehicle) {
        System.out.println(vehicle+"在汪洋里远航!");
    }

}

