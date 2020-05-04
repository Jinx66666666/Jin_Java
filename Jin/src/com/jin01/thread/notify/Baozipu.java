package com.jin01.thread.notify;

/**
 * @Description: 包子铺
 * @author: HuangJing
 * @date: 2020/01/09  15:38:53
 * @Version: 1.0
 **/
public class Baozipu extends Thread{
    private  Baozi bz;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if (bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 ==0) {
                    bz.pi = "薄";
                    bz.xian = "三鲜";
                }else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉";
                }

                count ++;
                System.out.println("包子铺正在生产包子" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag =true;
                bz.notify();
                System.out.println("包子铺生产好了包子" + bz.pi + bz.xian + "吃货可以吃了");
            }
        }
    }
}
