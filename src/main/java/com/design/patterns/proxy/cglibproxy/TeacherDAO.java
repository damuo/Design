package com.design.patterns.proxy.cglibproxy;

import com.design.patterns.proxy.jdkproxy.ITeacherDao;

/**
 * @Classname TeacherDAO
 * @Description 目标对象
 * @Date 2020/3/6 16:12
 * @Created by yang
 */
public class TeacherDAO  {

    public void teach() {
        System.out.println("这是目标方法1，执行成功!");
    }


    public void teach2() {
        System.out.println("这是目标方法2，执行成功!");
    }

    public void teach3() {
        System.out.println("这是目标方法3，执行成功!");
    }
}
