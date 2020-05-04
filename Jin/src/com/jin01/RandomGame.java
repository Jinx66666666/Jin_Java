package com.jin01;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: 随机数游戏
 * @author: HuangJing
 * @date: 2019/12/6  11:46:40
 * @Version: 1.0
 **/
public class RandomGame {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) +1;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字");
            int scNum = scanner.nextInt();

            if (scNum > randomNum){
                System.out.println("输入太大了");
            }else if(scNum < randomNum){
                System.out.println("输入太小了");
            }else{
                System.out.println("恭喜你！答对了");
                break;
            }
        }
        System.out.println("游戏结束");

    }
}
