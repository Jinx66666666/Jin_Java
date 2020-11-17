package com.jdk8.stream;

import java.util.ArrayList;

/**
 * @Description: Demo01
 * @author: HuangJing
 * @date: 2020/02/15  00:57:51
 * @Version: 1.0
 **/
public class StreamDemo01 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("华胥");
        list.add("赵信");
        list.add("赵子龙");
        list.add("赵高");
        list.stream().filter(name-> name.startsWith("赵"))
                .filter(name->name.length()==2)
                .forEach(name-> System.out.println(name));
    }
}
