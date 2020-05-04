package com.jin01.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: 多线程
 * @author: HuangJing
 * @date: 2020/01/07  16:38:19
 * @Version: 1.0
 **/
public class RunableImpl implements Runnable {
    private static int ticket = 100;
    Object obj = new Object();
    Lock lock = new ReentrantLock();

    @Override
   /* public void run() { //lock锁
        while (true){
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                ticket --;
            }
            lock.unlock();

        }
    }*/
    public void run() { //lock锁
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
    /*public void run() {  //RunnableDemo测试方法
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName() +  "-------->" + i);
        }
    }*/
   /* public void run() { //线程不安全
        while (true){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                ticket --;
            }

        }
    }*/
    /*public void run() { //同步代码块
        while (true){
            synchronized (obj){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                    ticket --;
                }
            }

        }
    }*/

    /* public void run() {//同步方法
         System.out.println(this);
         while (true) {
             payTicket1();
         }
     }*/
    private synchronized void payTicket1() {//同步方法方法一
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
            ticket--;
        }
    }

    private synchronized void payTicket2() {//同步方法方法二
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                ticket--;
            }
        }
    }

    private static synchronized void payTicket3() {//静态同步方法
        synchronized (RunableImpl.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---->正在卖" + ticket + "张票");
                ticket--;
            }
        }
    }


}
