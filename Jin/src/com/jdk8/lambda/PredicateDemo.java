package com.jdk8.lambda;

import java.util.function.Predicate;

/**
 * @Description: 对指定的数据类型进行判断
 * @author: HuangJing
 * @date: 2020/02/14  18:43:40
 * @Version: 1.0
 **/
public class PredicateDemo {
    private static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("为你千千万万遍", (s) -> {
            return s.length() > 6;
        });
        System.out.println(b);
    }
}
