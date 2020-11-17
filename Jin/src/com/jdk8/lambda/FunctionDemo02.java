package com.jdk8.lambda;

import java.util.function.Function;

/**
 * @Description: 三个函数式接口转换
 * @author: HuangJing
 * @date: 2020/02/15  00:17:49
 * @Version: 1.0
 **/
public class FunctionDemo02 {
    private static void change(String s, Function<String,String> fun1,
                              Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        change("黄晶,18",s ->s.split(",")[1] ,s ->Integer.parseInt(s) ,s->s+100);
    }
}
