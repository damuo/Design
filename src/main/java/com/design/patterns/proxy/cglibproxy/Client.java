package com.design.patterns.proxy.cglibproxy;


/**
 * @Classname Client
 * @Description 客服端模拟
 * @Date 2020/3/6 16:13
 * @Created by yang
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDAO target = new TeacherDAO();
        //获取代理对象，并且将目标对象作为参数传递给代理对象
        TeacherDAO proxyInstance = (TeacherDAO)new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        proxyInstance.teach();

        proxyInstance.teach2();

        proxyInstance.teach3();

    }
}
