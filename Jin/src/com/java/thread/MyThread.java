package com.java.thread;

/**
 * @Description: 多线程
 * @author: HuangJing
 * @date: 2020/01/07  14:44:29
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);

        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }
}
