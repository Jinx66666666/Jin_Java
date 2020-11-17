package com.jdk8.lambda;

import java.util.function.Consumer;

/**
 * @Description: 格式化打印信息
 * @author: HuangJing
 * @date: 2020/02/14  17:05:04
 * @Version: 1.0
 **/
public class ConsumerDemo02 {
    private static void method(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"盖伦,29","光辉,26","卡特琳娜,27","伊泽瑞尔,28"};
        method(arr,(message)->{
            String[] s = message.split(",");
            System.out.print(s[0] + ": ");
        },(message)->{
            String[] s = message.split(",");
            System.out.println(s[1] + "岁");
        });
    }
}
