package com.java.thread;

/**
 * @Description: 测试类
 * @author: HuangJing
 * @date: 2020/01/07  14:45:44
 * @Version: 1.0
 **/
public class ThreadDemo {

    public static void main(String[] args) {
        demo1();
    }

    private static void demo(){
        MyThread myThread = new MyThread();
        myThread.start();
        new MyThread().start();
    }
    private static void demo1(){
        for (int i = 0; i <60 ; i++) {//模拟秒表
            System.out.println(i);
            try {
                Thread.sleep(1000);//使用Thread类让程序睡眠1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
