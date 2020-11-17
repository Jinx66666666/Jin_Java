package com.jdk8.lambda;

import java.util.function.Function;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/14  23:27:57
 * @Version: 1.0
 **/
public class FunctionDemo {
    private static void change(String s, Function<String,Integer> fun){
        Integer apply = fun.apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        change("23241",s->Integer.parseInt(s));
    }
}
