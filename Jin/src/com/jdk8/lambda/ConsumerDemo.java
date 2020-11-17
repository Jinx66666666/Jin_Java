package com.jdk8.lambda;

import java.util.function.Consumer;

/**
 * @Description: 消费一个数据
 * @author: HuangJing
 * @date: 2020/02/14  01:16:39
 * @Version: 1.0
 **/
public class ConsumerDemo {
    public static void main(String[] args) {
        method("黄晶",(String name) ->{
            //对传过去的字符串进行消费
//            System.out.println(name);
            //自定义消费方法：将字符串反转输出
            String s = new StringBuffer(name).reverse().toString();
            System.out.println(s);
        });
    }
    private static void method(String name,Consumer<String> con){
        con.accept(name);
    }
}
