package com.design.patterns.adapter.Interfaceadapter;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Auther: 杨航
 * @Date: 2020/3/14 23:40
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter m1 = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("这是m1方法！");
            }
        };
        m1.m1();
    }
}