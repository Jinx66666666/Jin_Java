package com.jin01.thread.notify;

/**
 * @Description: 吃货
 * @author: HuangJing
 * @date: 2020/01/09  16:02:25
 * @Version: 1.0
 **/
public class Chihuo extends Thread{
    private Baozi bz;

    public Chihuo(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+ bz.pi+ bz.xian+"的包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把" + bz.pi+ bz.xian + "的包子吃完了");
            }
        }
    }
}
