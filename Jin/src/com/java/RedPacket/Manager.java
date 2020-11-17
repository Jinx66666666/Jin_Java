package com.java.RedPacket;

import java.util.ArrayList;

/**
 * @Description: 群主
 * @author: HuangJing
 * @date: 2019/12/16  11:19:29
 * @Version: 1.0
 **/
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();
        //查看一下群主有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return list;
        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包，平均拆成从count份
        int avg = totalMoney / count;//平均值
        int mod = totalMoney % count;//余数
        //除不开的零头，放在最后一个红包当中，把平均值放在每个红包中
        for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }
        int last = avg + mod;
        list.add(last);
        return list;
    }

}
