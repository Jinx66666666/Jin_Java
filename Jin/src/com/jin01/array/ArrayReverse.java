package com.jin01.array;

/**
 * @Description: 数组的反转
 * @author: HuangJing
 * @date: 2019/11/26  20:29:42
 * @Version: 1.0
 **/
public class ArrayReverse {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};
        System.out.println("数组的长度为："+array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("++++++++++++++++++++++++++");
        for (int min = 0, max =  array.length -1; min< max;max --, min++) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
