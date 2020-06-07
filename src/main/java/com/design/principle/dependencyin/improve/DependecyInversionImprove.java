package com.design.principle.dependencyin.improve;

/**
 * @author yanghang
 * @date 2020/1/23 14:30
 * @description 描述
 */
public class DependecyInversionImprove {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义接口
interface IReceviver{
    public String getInfo();
}

//接收邮件
class Email implements IReceviver{
    public String getInfo(){
        return "电子邮件信息: hello,world!";
    }
}

//接收微信
class WeiXin implements IReceviver{

    public String getInfo() {
        return "微信信息: hello,world!";
    }
}

class Person{
    public void receive(IReceviver iReceviver){
        System.out.println(iReceviver.getInfo());
    }
}
