package com.jin01.InterfaceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/17  11:51:27
 * @Version: 1.0
 **/
public class DemoMain {

    public static void main(String[] args) {
        //使用了匿名内部类，但不是匿名对象，对象名叫：myInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void methodAbstract() {
                System.out.println("爱你千千万万遍");
            }
        };
        myInterface.methodAbstract();
        //使用了匿名内部类，而且省略了对象名称，也是匿名的对象
        new MyInterface() {
            @Override
            public void methodAbstract() {
                System.out.println("爱你");
            }
        }.methodAbstract();

        List<Object> list = new ArrayList<>();

        ArrayList<Object> objects = new ArrayList<>();
        MyInterface my = new MyImpl();

        System.out.println("++++++++++++++++++++++++++++++");

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
