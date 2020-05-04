package com.jdk7.lambda;

/**
 * @Description: lambda表达式
 * @author: HuangJing
 * @date: 2020/02/13  21:14:14
 * @Version: 1.0
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
               /* Thread.currentThread():获取当前正在执行的线程，
                Thread.currentThread().getName()：获取当前正在执行的线程的名称*/
                System.out.println(Thread.currentThread().getName() +"-->"+ "启动了" );
            }
        });
        startThread(()-> System.out.println(Thread.currentThread().getName() +"-->"+ "启动了"));
    }
    public static void startThread(Runnable run){
        new Thread(run).start();
    }
}
