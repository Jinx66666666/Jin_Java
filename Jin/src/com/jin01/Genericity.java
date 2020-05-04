package com.jin01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * @Description: 泛型
 * @author: HuangJing
 * @date: 2019/12/25  17:35:43
 * @Version: 1.0
 **/
public class Genericity {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("一");
        list2.add("二");
        /*printArray(list1);
        printArray(list1);*/
        ArrayList<Number> list3 = new ArrayList<>();
        list3.add(3);
        ArrayList<Object> list4 = new ArrayList<>();

        getElement1(list1);
      //  getElement1(list2);
        getElement1(list3);
       // getElement1(list4);

      //  getElement2(list1);
      //  getElement2(list2);
        getElement2(list3);
        getElement2(list4);

    }

    public static void printArray(ArrayList<?> list){

        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

    }
    /*类与类的继承关系： Integer extends Number extends Object
    String extends Object*/
    //泛型的上限：此时的泛型?，必须是Number 和 Number的子类

    public static void getElement1(Collection<? extends Number> coll){
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    //泛型的下限：此时的泛型?，必须是Number 和 Number的父类
    public static void getElement2(Collection<? super Number> coll){
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
