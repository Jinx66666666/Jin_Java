package com.java.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description: 迭代器
 * @author: HuangJing
 * @date: 2019/12/25  13:37:56
 * @Version: 1.0
 **/
public class IteratorDemo {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("华润");
        list.add("华润1");
        list.add("华润2");
        list.add("华润3");

        Iterator<String> it = list.iterator();

        String next = it.next();
        System.out.println(next);
        String next1 = it.next();
        System.out.println(next1);
        while (it.hasNext()){
            String next2 = it.next();
            System.out.println(next2);
        }
        System.out.println("+++++++++++++++++++++++++++==================");
        for(String c : list){
            System.out.println(c);
        }
    }

}
