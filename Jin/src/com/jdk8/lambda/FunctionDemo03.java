package com.jdk8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;


/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/15  00:26:17
 * @Version: 1.0
 **/
public class FunctionDemo03 {
    private static void change(String s, Function<String,Integer> fun, Consumer<Integer> con){
       con.accept(fun.apply(s));
    }

    public static void main(String[] args) {
        change("黄晶,19",s->Integer.parseInt(s.split(",")[1]),s-> System.out.println(s+100));
    }
}
