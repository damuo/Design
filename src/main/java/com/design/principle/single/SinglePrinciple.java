package com.design.principle.single;

/**
 * @author yanghang
 * @date 2020/1/23 10:30
 * @description 原型案例
 */
public class SinglePrinciple {
    public static void main(String[] args) {
        VehicleRun vehicleRu = new VehicleRun();
        vehicleRu.run("汽车");
        vehicleRu.run("飞机");
        vehicleRu.run("游轮");

    }
}

class VehicleRun {
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上行驶！");
    }
}
