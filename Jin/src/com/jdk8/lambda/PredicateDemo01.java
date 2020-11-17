package com.jdk8.lambda;

import java.util.function.Predicate;

/**
 * @Description: and
 * @author: HuangJing
 * @date: 2020/02/14  19:09:51
 * @Version: 1.0
 **/
public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean bln = check("为你千千万万遍", (s) -> {
            return s.length()>6;
        }, (s) -> {
            return s.contains("万");
        });
        System.out.println(bln);
    }
    private static boolean check(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }
}
