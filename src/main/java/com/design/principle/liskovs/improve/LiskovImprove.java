package com.design.principle.liskovs.improve;

/**
 * @author yanghang
 * @date 2020/1/23 20:28
 * @description 里氏替换原则优化
 */
public class LiskovImprove {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.func1(6,3));
        System.out.println(b.func3(6,3));
    }
}

class Base{
    //基类

}

//A类
class A extends Base{
    //返回两个数字的差
    public int func1(int num1 ,int num2){
        return num1-num2;
    }
}

//B类
class B extends Base {
    //当B类需要使用A类的方法时，使用组合
    private A  a=new A();
    //此处已经覆盖了A的方法func1
    public int func1(int a, int b){
        return a+b;
    }

    public int func2(int a ,int b){
        return func1(a,b)+9;
    }
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
