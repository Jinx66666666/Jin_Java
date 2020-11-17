package com.java.basics;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/18  16:20:51
 * @Version: 1.0
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);

        System.out.println(p1);
        Person p2 = new Person("迪丽热巴", 18);
        System.out.println(p2);

        ArrayList<String> arrayList = new ArrayList<>();

        boolean b = p1.equals(p2);
        boolean b2 = p1.equals(arrayList);
        System.out.println(b);
        System.out.println(b2);

        String str1 = null;
        String str2 = "we";

        boolean equals = str2.equals(str1);
        boolean equals1 = str1.equals(str2);//NullPointerException
        boolean equals2 = Objects.equals(str1,str2);

        System.out.println(equals);//false
        System.out.println(equals1);//NullPointerException
        System.out.println(equals2);//false
    }
}
