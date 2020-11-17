package com.java.thread.lambda;

/**
 * @Description: lambda表达式
 * @author: HuangJing
 * @date: 2020/01/10  11:42:29
 * @Version: 1.0
 **/
public class LambdaDemo {
    public static void main(String[] args) {
//        使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建一个");
            }
        }).start();
//        使用lambda表达式
        new Thread(()->{
            System.out.println("使用一个Lambda表达式"+Thread.currentThread().getName());
        }).start();
//        优化省略大括号
        new Thread(()->
            System.out.println("优化使用一个Lambda表达式"+Thread.currentThread().getName())).start();
    }
}
