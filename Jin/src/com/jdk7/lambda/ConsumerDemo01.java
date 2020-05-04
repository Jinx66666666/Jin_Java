package com.jdk7.lambda;

import java.util.function.Consumer;

/**
 * @Description: Consumer接口的静默方法andthen
 * @author: HuangJing
 * @date: 2020/02/14  16:38:53
 * @Version: 1.0
 **/
public class ConsumerDemo01 {
    public static void main(String[] args) {
        method("Hello Jin",(s)->{
            System.out.println(s.toLowerCase());
        },(s)->{
            System.out.println(s.toUpperCase());
        });
    }
    private static void method(String name , Consumer<String> con1,Consumer<String> con2){
        /*con1.accept(name);
        con2.accept(name);*/
        con1.andThen(con2).accept(name);
    }
}
