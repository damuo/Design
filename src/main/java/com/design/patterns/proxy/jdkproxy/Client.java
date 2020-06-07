package com.design.patterns.proxy.jdkproxy;


/**
 * @Classname Client
 * @Description 客服端模拟
 * @Date 2020/3/6 16:13
 * @Created by yang
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDAO();
        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        //通过代理对象中的方法，调用被代理对象的方法
        //System.out.println(proxyInstance.getClass());
        proxyInstance.teach();

        proxyInstance.teach2();

    }
}
