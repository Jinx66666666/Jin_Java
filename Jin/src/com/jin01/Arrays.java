package com.jin01;

/**
 * @Description: 数组工具类
 * @author: HuangJing
 * @date: 2019/12/12  16:50:40
 * @Version: 1.0
 **/
public class Arrays {


    public static void main(String[] args) {
//        int[] intArrays = new  int[]{2,23,423,23};//标准格式
        int[] intArrays = {2,23,423,23};
        /*String s = java.util.Arrays.toString(intArrays);
        System.out.println(intArrays);
        System.out.println("+++++++++++");
        System.out.println(s);

        java.util.Arrays.sort(intArrays);
        System.out.println(java.util.Arrays.toString(intArrays));*/

        String str = "8734fnvckl";
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
