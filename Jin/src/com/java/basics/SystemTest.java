package com.java.basics;

import java.util.Arrays;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/20  10:35:01
 * @Version: 1.0
 **/
public class SystemTest {

    public static void main(String[] args) {
//        demo();

        int[] src = {1,2,3,4,5};
        int[] jin = {6,7,8,9,10};

        System.arraycopy(src,0,jin,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(jin));
    }

    private static void demo(){
        long l = System.currentTimeMillis();

        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();

        System.out.println(l1-l);
    }
}
