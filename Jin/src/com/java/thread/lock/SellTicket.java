package com.java.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SellTicket
 * @program: Jin_Java
 * @Description: 售票
 * @author: Jin
 * @Date: 2020/12/18 11:43
 * @version: V1.0
 */
public class SellTicket implements Runnable {

    private int tickets = 100;

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        SellTicket sellTicket = new SellTicket();
        //创建3个Thread类的对象，把SellTicket作为构造方法的参数，并给出对应窗口的名称
        Thread t1 = new Thread(sellTicket, "窗口1");
        Thread t2 = new Thread(sellTicket, "窗口2");
        Thread t3 = new Thread(sellTicket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    //通过sleep()方法来模拟出票的时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第： " + tickets + " 张票！");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }

    }
}
