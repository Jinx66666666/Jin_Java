package com.jdk7.lambda;

import java.util.function.Supplier;

/**
 * @Description: 求数组最大值
 * @author: HuangJing
 * @date: 2020/02/14  01:05:56
 * @Version: 1.0
 **/
public class SupplierDemo01 {
    public static void main(String[] args) {
        int[] arr = {1,111,222,333,444,666};
        int maxVaule = getMaxVaule(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxVaule);
    }
    private static int getMaxVaule(Supplier<Integer> sup){
        return sup.get();
    }
}
