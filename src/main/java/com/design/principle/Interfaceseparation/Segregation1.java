package com.design.principle.Interfaceseparation;

/**
 * @author yanghang
 * @date 2020/1/23 10:58
 * @description 接口隔离
 *
 */
public class Segregation1 {
    public static void main(String[] args) {
        //此时创建相应实例都会实现所有接口的方法
    }
}

//接口
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

//类B
class B implements Interface1{

    public void operation1() {
        System.out.println("B类实现了接口方法operation1");
    }

    public void operation2() {
        System.out.println("B类实现了接口方法operation2");
    }

    public void operation3() {
        System.out.println("B类实现了接口方法operation3");
    }

    public void operation4() {
        System.out.println("B类实现了接口方法operation4");
    }

    public void operation5() {
        System.out.println("B类实现了接口方法operation5");
    }
}

//类D
class D implements Interface1{

    public void operation1() {
        System.out.println("D类实现了接口方法operation1");
    }

    public void operation2() {
        System.out.println("D类实现了接口方法operation2");
    }

    public void operation3() {
        System.out.println("D类实现了接口方法operation3");
    }

    public void operation4() {
        System.out.println("D类实现了接口方法operation4");
    }

    public void operation5() {
        System.out.println("D类实现了接口方法operation5");
    }
}

//A类通过接口Interface1依赖(使用)B类，但只会用1，2，3方法
class A{
    public void  depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void  depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void  depend3(Interface1 interface1){
        interface1.operation3();
    }
}


//C类通过接口Interface1依赖(使用)B类，但只会用1，4，5方法
class C{
    public void  depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void  depend2(Interface1 interface1){
        interface1.operation4();
    }
    public void  depend3(Interface1 interface1){
        interface1.operation5();
    }
}

