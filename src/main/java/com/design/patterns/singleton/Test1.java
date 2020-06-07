package com.design.patterns.singleton;

/**
 * @author yanghang
 * @date 2020/2/1 19:28
 * @description 饿汉式:静态常量
 */
public class Test1 {
    public static void main(String[] args) {
        //测试
        Singleton instance=Singleton.getInstanace();
        Singleton instance1=Singleton.getInstanace();
        System.out.println(instance==instance1);
    }
}

//饿汉式:静态变量
class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){}
    //2.本类的内部创建对象实例
    private final  static Singleton instanace=new Singleton();
    //3.提供一个共有静态方法，返回实例对象
    public static Singleton getInstanace(){
        return instanace;
    }
}
