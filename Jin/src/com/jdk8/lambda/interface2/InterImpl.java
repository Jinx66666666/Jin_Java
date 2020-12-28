package com.jdk8.lambda.interface2;

public class InterImpl implements Inter,Flyable {
    @Override
    public void show() {
        System.out.println("show方法执行了");
    }
}
