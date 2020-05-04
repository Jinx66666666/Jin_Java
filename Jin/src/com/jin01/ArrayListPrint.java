package com.jin01;

import java.util.ArrayList;

/**
 * @Description: 数组打印
 * @author: HuangJing
 * @date: 2019/12/10  16:01:16
 * @Version: 1.0
 **/
public class ArrayListPrint {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        print(list);
        {
            {

            }
        }

    }

    public static void print (ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                System.out.println(list.get(i) + "}");
            }else{

                System.out.print(list.get(i) + "@");
            }
        }
    }
}
