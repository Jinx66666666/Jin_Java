package com.jin01.throwDemo;

import java.io.FileNotFoundException;
import java.util.Objects;

/**
 * @Description: 异常
 * @author: HuangJing
 * @date: 2020/01/06  16:52:36
 * @Version: 1.0
 **/
public class ThrowDemo01 {

    public static void main(String[] args) {
//        getElement(null,3);
//        methods(null);
        try {
            readFile("ddd");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
//            e.printStackTrace();
        }
    }

    private  static int getElement(int[] arr,int index){

        if (arr == null) {
            throw new NullPointerException("传递的数组为NULL");
        }
        int i = arr[index];
        return i;

    }

    private static void methods(Object object){
//        Objects.requireNonNull(object);
        Objects.requireNonNull(object,"ainisdf");
    }

    private static void readFile(String fileName) throws FileNotFoundException {

        if (!fileName.equals("aaa")) {
            throw new FileNotFoundException("路径错误");
        }
        System.out.println("我爱你");

    }

}
