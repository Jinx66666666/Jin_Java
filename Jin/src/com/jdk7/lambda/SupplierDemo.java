package com.jdk7.lambda;

import java.util.function.Supplier;

/**
 * @Description: Suppler接口
 * @author: HuangJing
 * @date: 2020/02/14  00:35:41
 * @Version: 1.0
 **/
public class SupplierDemo {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
/*        String s = getString(() -> {
            return "黄晶";
        });*/
        String s = getString(() -> "黄晶");
        System.out.println(s);
    }
}
