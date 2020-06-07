package com.design.principle.single;

/**
 * @author yanghang
 * @date 2020/1/23 1:46
 * @description 在类上遵循单一职责原则
 */
public class SinglePrinciple2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("歼20");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游艇");
    }
}

class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上行驶！");
    }
}

class AirVehicle{
    public void run(String vehicle){
            System.out.println(vehicle+"在天空飞行！");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水中行驶！");
    }
}

