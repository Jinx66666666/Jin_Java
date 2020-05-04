package com.jin01;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/11/22  15:21:45
 * @Version: 1.0
 **/
public class HelloJin {
    public static void main(String[] args) {
        for (int i = 1 ; i < 24; i++){
            for (int j = 1 ; j < 60; j ++){
                if(i==5 && j==21){
                    System.out.println("我爱你!");
                    break;
                }
                System.out.println("爱你第" + i + "小时," + j +"秒");
            }
            if (i == 5 ){
                break;
            }
        }
    }
}
