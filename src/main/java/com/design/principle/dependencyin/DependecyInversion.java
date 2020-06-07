package com.design.principle.dependencyin;

/**
 * @author yanghang
 * @date 2020/1/23 13:56
 * @description 描述
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息: hello,world!";
    }
}
//完成Person接收消息的功能

/**
 * 方式1
 *
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}


