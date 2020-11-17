package com.java.thread.lambda;

/**
 * @Description: 计数器测试类
 * @author: HuangJing
 * @date: 2020/01/13  10:41:44
 * @Version: 1.0
 **/
public class CalculatorDemo {

    public static void main(String[] args) {
        invokeCalc(10,20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
    }
    public static void invokeCalc(int a, int b ,Calculator c){
        int calc = c.calc(a, b);
        System.out.println(calc);
    }
}
