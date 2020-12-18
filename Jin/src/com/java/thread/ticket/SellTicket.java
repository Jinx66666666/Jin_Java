package com.java.thread.ticket;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName SellTicket
 * @program: Jin_Java
 * @Description: 售票
 * @author: Jin
 * @Date: 2020/12/18 11:43
 * @version: V1.0
 */
public class SellTicket implements Runnable {
//    private int tickets = 100;
    private static int tickets = 100;
    private Object object = new Object();//自定义一个同步锁
    private int x = 0;

    @Override
    public void run() {

        while (true) {
            if (x % 2 == 0) {
                //同步代码块的好处：解决了多线程的数据安全问题，
                //当多线程很多时，因为每个现场都会判断同步上的锁，这是很浪费资源的，无形中降低程序的运行效率
                staticTickets();
            } else {
                synTicket();
            }
            x++;
        }

    }

    /**
     * 使用同步代码块
     */
    private void synTicket() {
//        synchronized (object) {//自定义一个锁对象，保证唯一，不能使用synchronized (new Object)
//        synchronized (this) {//同步方法的锁对象是：this,    this指非静态方法的锁对象，静态锁对象不能使用this
        synchronized (SellTicket.class) {//同步静态方法的锁对象是：类名.class
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
        }
    }

    /**
     *使用同步方法
     * 格式： 修饰符 + synchronized + 返回值类型 + 方法名称(){}
     */
    private synchronized void synTickets() {
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
    }

    /**
     * 同步静态方法
     * 格式： 修饰符 + static + synchronized + 返回值类型 + 方法名称(){}
     */
    private static synchronized void staticTickets() {
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
    }
    public static void main(String[] args) {

        SellTicket sellTicket = new SellTicket();
        //创建3个Thread类的对象，把SellTicket作为构造方法的参数，并给出对应窗口的名称
        Thread t1 = new Thread(sellTicket, "窗口1");
        Thread t2 = new Thread(sellTicket, "窗口2");
        Thread t3 = new Thread(sellTicket, "窗口3");

        t1.start();
        t2.start();
        t3.start();

//        Collections.synchronizedList(new ArrayList<String>());//线程安全的集合类
    }
}
