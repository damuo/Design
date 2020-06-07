package com.design.patterns.proxy.jdkproxy;

/**
 * @Classname TeacherDAO
 * @Description 目标对象
 * @Date 2020/3/6 16:12
 * @Created by yang
 */
public class TeacherDAO implements ITeacherDao {
    /**
     * 方法1的实现
     */
    @Override
    public void teach() {
        System.out.println("这是目标方法1，执行成功!");
    }

    /**
     * 方法2的实现
     */
    @Override
    public void teach2() {
        System.out.println("这是目标方法2，执行成功!");
    }
}
