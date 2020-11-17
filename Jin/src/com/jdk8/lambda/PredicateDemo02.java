package com.jdk8.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Description: 集合信息筛选
 * @author: HuangJing
 * @date: 2020/02/14  22:47:49
 * @Version: 1.0
 **/
public class PredicateDemo02 {
    private static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "奥巴马,男", "杨幂,女"};
        ArrayList<String> list = filter(arr, s -> s.split(",")[0].length() == 4, s ->s.split(",")[1].equals("女"));
        System.out.println(list);
    }
}
