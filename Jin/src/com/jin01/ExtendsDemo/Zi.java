package com.jin01.ExtendsDemo;

/**
 * @Description: 子类
 * @author: HuangJing
 * @date: 2019/12/13  11:39:50
 * @Version: 1.0
 **/
public class Zi extends Fu{

    public Zi() {
//        super();//在调用父类的无参构造
        super(39);//super 的父类调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
        System.out.println("子类构造方法");
    }
    public void method(){
//        super();错误写法，只有子类构造器才能调用父类方法
    }

}
