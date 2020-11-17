package com.java.array;

/**
 * @Description: 数组作为方法返回值返回
 * @author: HuangJing
 * @date: 2019/11/26  22:20:58
 * @Version: 1.0
 **/
public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 10, 10);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    /*
     *
     * @Description:一个方法只有一个返回值，可以有多个参数，如果有多个结果进行返回，可以使用数组作为返回值类型
     * 任何数据类型可以作为方法的参数类型，也可作为方法的返回值类型
     * 数组作为方法的参数，传递进去的实际上是数组的地址值
     * 数组作为方法的返回值，返回实际上也是方法的地址值
     *
     * @param a
     * @param b
     * @param c
     * @return: int[]
     *      
     *
     */
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = a*b*c;
        int[] array = {sum,avg};
        return array;
    }

}
