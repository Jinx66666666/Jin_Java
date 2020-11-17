package com.java.array;

/**
 * @Description: 为你千千万万遍
 * @author: HuangJing
 * @date: 2019/11/26  17:08:42
 * @Version: 1.0
 **/
public class ArrayMax {
    public static void main(String[] args) {
       /*int[] i = {18,31};
        System.out.println(i[0]);
        System.out.println(i[1]);
        // System.out.println(i[2]);

        int[] array = null;
        System.out.println(array[0]);*/

        //获取数组的长度
        int[] arr = {10,20,30,43,1,1000};
        System.out.println(arr.length);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);
    }
}
