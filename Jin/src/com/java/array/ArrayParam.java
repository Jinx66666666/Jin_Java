package com.java.array;

/**
 * @Description: 数组作为方法传参
 * @author: HuangJing
 * @date: 2019/11/26  20:47:54
 * @Version: 1.0
 **/
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printArray(array);
    }
/*
 *
 * @Description:三要素
 * 返回值类型:只需要打印而已，不需要计算，也没有结果，用void
 * 方法名称：printArray
 * 参数列表:必须给窝传数组，我才能打印其中的元素
 *
 * @param array
 * @return: void
 *tip：任何的数据类型类型都可以作为方法的参数
 * 数组可以作为方法的参数
 * 当调用方法的时候，向方法的小括号内传参，传进去的其实是数组的地址值
 */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
