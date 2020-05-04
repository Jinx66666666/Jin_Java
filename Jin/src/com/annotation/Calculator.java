package com.annotation;

/**
 * @Description: 计算器
 * @author: HuangJing
 * @date: 2020/02/17  13:08:45
 * @Version: 1.0
 **/
public class Calculator {
    @Check
    public void add(){
        System.out.println("1+0 = " + (1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0 = " + (1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0 = " + (1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0 = "  + (1/0));
    }
}
