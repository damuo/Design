package com.design.patterns.proxy.staproxy;

/**
 * @Classname TeacherDAO
 * @Description 目标对象
 * @Date 2020/3/6 16:12
 * @Created by yang
 */
public class TeacherDAO implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("这是目标方法，执行成功!");
    }
}
