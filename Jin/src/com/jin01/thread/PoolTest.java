package com.jin01.thread;

/**
 * @Description: 线程池测试类
 * @author: HuangJing
 * @date: 2020/01/10  10:11:19
 * @Version: 1.0
 **/
public class PoolTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行！！！！！！！！");
    }
}
