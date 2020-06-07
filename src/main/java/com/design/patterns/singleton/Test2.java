package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 20:24
 * @description 恶汉模式:静态代码块
 */
public class Test2 {
    public static void main(String[] args) {
        //测试
        Singleton2 instance=Singleton2.getInstanace();
        Singleton2 instance1=Singleton2.getInstanace();
        System.out.println(instance==instance1);
    }
}

//饿汉式:静态变量
class Singleton2{
    //1.构造器私有化，外部能new
    private Singleton2(){}
    //2.本类的内部创建对象实例
    private static Singleton2 instanace2;
    static {
        instanace2=new Singleton2();
    }
    //3.提供一个共有静态方法，返回实例对象
    public static Singleton2 getInstanace(){
        return instanace2;
    }
}