package com.design.patterns.proxy.staproxy;

/**
 * @Classname TeacherDAOProxy
 * @Description 代理类
 * @Date 2020/3/6 16:12
 * @Created by yang
 */
public class TeacherDAOProxy implements ITeacherDao{
    /**
     * 合成复用原则:在一个实现类下调用其他实现类的方法
     */
    private ITeacherDao target;

    public TeacherDAOProxy(ITeacherDao target){
        this.target=target;
    }
    /**
     * 代理类实现额外功能添加方法
     */
    @Override
    public void teach() {
        //额外功能部分
        System.out.println("代理类添加额外功能");
        //执行目标对象的方法
        target.teach();
        //额外功能部分
        System.out.println("代理类添加额外功能");
    }
}
