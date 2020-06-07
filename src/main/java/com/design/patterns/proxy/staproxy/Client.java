package com.design.patterns.proxy.staproxy;

/**
 * @Classname Client
 * @Description 客服端模拟
 * @Date 2020/3/6 16:13
 * @Created by yang
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDAO teacherDAO = new TeacherDAO();
        //创建代理对象(将被代理对象作为参数传入)
        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);
        //通过代理对象中的方法，调用被代理对象的方法
        teacherDAOProxy.teach();
    }
}
