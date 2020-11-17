package com.java.ExtendsDemo;

/**
 * @Description: 测试
 * @author: HuangJing
 * @date: 2019/12/13  11:41:51
 * @Version: 1.0
 **/
public class TestExtends {

    public static void main(String[] args) {
        Zi zi = new Zi();
//        Animal animal = new Animal();//不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }
}

