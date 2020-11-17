package com.jdk8.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: 方法的返回值类型是是一个函数的接口
 * @author: HuangJing
 * @date: 2020/02/13  21:43:59
 * @Version: 1.0
 **/
public class ComparatorDemo {
    private static Comparator<String> getComparator(){
/*        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };*/
//        使用lambda表达式优化
/*
        return (String o1, String o2) ->{
            return o1.length() - o2.length();
    };
*/
//     继续优化
        return (o1,o2)->o2.length() - o1.length();
    }

    public static void main(String[] args) {
     String[] arr =   {"rrr","aaa","ddd","gggg","sss"};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
