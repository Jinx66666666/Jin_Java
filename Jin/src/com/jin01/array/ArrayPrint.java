package com.jin01.array;

import java.util.Arrays;

/**
 * @Description: 面向对象
 * @author: HuangJing
 * @date: 2019/11/28  08:37:10
 * @Version: 1.0
 **/
public class ArrayPrint {

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //使用面对过程与面对对象
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1 ){
                System.out.println(array[i] + "]");
            }else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("=============");
//        使用面对对象编程
        System.out.println(Arrays.toString(array));
    }
}
