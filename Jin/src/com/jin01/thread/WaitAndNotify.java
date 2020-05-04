package com.jin01.thread;

/**
 * @Description: 线程等待和唤醒
 * @author: HuangJing
 * @date: 2020/01/08  15:34:01
 * @Version: 1.0
 **/
public class WaitAndNotify {

    public static void main(String[] args) {
        Object o = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客1下订单");
                        try {
                            o.wait(5000);//5秒后自己唤醒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1已收货");
                        System.out.println("===================================");
                    }
                }

            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客二下订单");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客二已收货");
                        System.out.println("===================================");
                    }
                }

            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("已出库");
//                        o.notify();//如果有多个线程等待，只能唤醒一个
                        o.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
