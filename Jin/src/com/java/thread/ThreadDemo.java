package com.java.thread;

import org.junit.Test;

/**
 * @Description: 测试类
 * @author: HuangJing
 * @date: 2020/01/07  14:45:44
 * @Version: 1.0
 **/
public class ThreadDemo {

    public static void main(String[] args) {
//        demo();
        System.out.println(Thread.currentThread().getName());
    }

    private static void demo() {
        MyThread myThread = new MyThread();
        myThread.start();
        new MyThread().start();
    }

    private static void demo1() {
        for (int i = 0; i < 60; i++) {//模拟秒表
            System.out.println(i);
            try {
                Thread.sleep(1000);//使用Thread类让程序睡眠1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * getPriority 返回线程的优先级
     */
    @Test
    public void getPriority() {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread.setName("Jin");
        myThread2.setName("Jin1");
        myThread3.setName("Jin2");

        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread3.setPriority(Thread.NORM_PRIORITY);

        System.out.println(myThread.getPriority());
        System.out.println(myThread2.getPriority());
        System.out.println(myThread3.getPriority());

        myThread.start();
        try {
            myThread.join();//等待这个线程死亡
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.start();
        myThread3.start();
    }

    @Test
    public void deamon() {
        MyThread td = new MyThread();
        MyThread td1 = new MyThread();

        td.setName("关羽");
        td1.setName("张飞");

        //设置主线程
        Thread.currentThread().setName("Jin");

        //设置守护线程
        td.setDaemon(true);
        td1.setDaemon(true);

        td.start();
        td1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +" : "+ i);
        }


    }
}
