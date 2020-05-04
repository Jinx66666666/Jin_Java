package com.jin01;

/**
 * @Description: 随机数
 * @author: HuangJing
 * @date: 2019/12/6  11:03:01
 * @Version: 1.0
 **/
public class Random {

    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
       /* int i = random.nextInt();
        System.out.println(i);
        for (int x = 0; x < 100; x++) {
            int num = random.nextInt(10); //取值范围在0~9
            System.out.println(num);
        }*/
        int n = 10;

        for (int j = 0; j < 100; j++) {
            int num1 = random.nextInt(n + 1);//取值范围在0~10
            System.out.println(num1);
            int num2 = random.nextInt(n) + 1;//取值范围在1~10
            System.out.println(num2);
        }
    }
}
