package com.jdk8.lambda;

import java.util.function.Function;

/**
 * @Description: andThen
 * @author: HuangJing
 * @date: 2020/02/14  23:51:08
 * @Version: 1.0
 **/
public class FunctionDemo01 {
    private static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }
    public static void main(String[] args) {
        change("100",s -> Integer.parseInt(s) +10,s-> s+"");
    }
}
