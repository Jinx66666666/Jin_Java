package com.java.thread.lambda;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/01/10  14:02:12
 * @Version: 1.0
 **/
public class CookDemo {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("该吃饭了！");
            }
        });

        invokeCook(()->{
            System.out.println("吃啥吃");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
