package com.java.basics;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/13  08:32:41
 * @Version: 1.0
 **/
public class Math {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;

        for (int i = (int) min; i < max; i++) {
            int abs = java.lang.Math.abs(i);

            if (abs>6 || abs <2.1){
                System.out.println(abs);
                count ++;
            }
        }
        System.out.println("在-10.8和5.8范围内的个数为："+count);

    }

}
