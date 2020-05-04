package com.jin01.thread.notify;

/**
 * @Description: 测试类
 * @author: HuangJing
 * @date: 2020/01/09  16:25:17
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        new Baozipu(baozi).start();
        new Chihuo(baozi).start();
    }
}
