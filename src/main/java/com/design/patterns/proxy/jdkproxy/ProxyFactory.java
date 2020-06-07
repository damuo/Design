package com.design.patterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname ProxyFactory
 * @Description TODO
 * @Date 2020/3/6 16:43
 * @Created by yang
 */
public class ProxyFactory {
    /**
     * 合成复用原则:在一个实现类下调用其他实现类的方法
     */
    private ITeacherDao target;

    public ProxyFactory(ITeacherDao target){
        this.target=target;
    }

    //代理对象
    public Object getProxyInstance(){
        //参数1:指定当前目标对象使用类加载器，获取加载器的方法固定
        //参数2:目标对象实现的接口类型，使用泛型确认类型
        //参数3:事件处理，执行目标对象方法时，会触发事件处理器方法(会把当前目标对象方法作为参数)
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //额外功能部分
                        System.out.println("代理类添加额外功能1");
                        //通过反射机制调用目标对象方法
                        Object result = method.invoke(target, args);
                        //额外功能部分
                        System.out.println("代理类添加额外功能2");
                        return result;
                    }
                });
    }
}
