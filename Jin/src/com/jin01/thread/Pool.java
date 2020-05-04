package com.jin01.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 线程池
 * @author: HuangJing
 * @date: 2020/01/10  09:40:11
 * @Version: 1.0
 **/
public class Pool {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new PoolTest());
        pool.submit(new PoolTest());
        pool.submit(new PoolTest());
        pool.shutdown();
    }
}
