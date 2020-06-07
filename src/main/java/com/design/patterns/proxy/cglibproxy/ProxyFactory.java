package com.design.patterns.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname ProxyFactory
 * @Description TODO
 * @Date 2020/3/6 16:43
 * @Created by yang
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回一个代理对象:即target的代理对象
    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象(代理对象)
        return enhancer.create();
    }
    //重写方法
    @Override
    public Object intercept(Object obj,
                            Method method,
                            Object[] args,
                            MethodProxy proxy) throws Throwable {
        //额外功能部分
        System.out.println("代理类添加额外功能1");
        //通过反射机制调用目标对象方法
        Object result = method.invoke(target, args);
        //额外功能部分
        System.out.println("代理类添加额外功能2");
        return result;
    }
}
