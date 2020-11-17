package com.java.thread.lambda;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/01/13  12:45:26
 * @Version: 1.0
 **/
public class CalculatorDemo2 {
    public static void main(String[] args) {
//        使用匿名内部类
        invokeCalc(49, new Calculator2() {
            @Override
            public int calc(int a) {
                return a;
            }
        });
//        使用lambda
        invokeCalc(10,(int a) ->{
            return a ;
        });
        //如果小括号内有且仅有一个参数，则小括号可以省略
        invokeCalc(30 ,a->{
            return a;
        });
    }
    public static void invokeCalc(int a,Calculator2 c){
        int calc = c.calc(a);
        System.out.println(calc);
    }
}
