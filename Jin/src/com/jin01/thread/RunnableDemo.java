package com.jin01.thread;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/01/07  16:40:31
 * @Version: 1.0
 **/
public class RunnableDemo {
    public static void main(String[] args) {
        demo3();
    }

    private static void demo() {
        RunableImpl runable = new RunableImpl();
        Thread thread = new Thread(runable);

        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-------->" +i);
        }
    }
    private static void demo2(){
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Jin "  + i);
                }
            }
        }.start();
        //线程的接口是Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Ye " + i);
                }
            }
        };
        new Thread(runnable).start();
        //简写
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " huangjing " + i);
                }
            }
        }).start();
    }
    private static void demo3(){
        RunableImpl runable = new RunableImpl();
        System.out.println("测试类"+runable);
        Thread t1 = new Thread(runable);
        Thread t2 = new Thread(runable);
        Thread t3 = new Thread(runable);
        t1.start();
        t2.start();
        t3.start();

    }
}
