package com.java.RedPacket;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: 成员类
 * @author: HuangJing
 * @date: 2019/12/16  11:38:39
 * @Version: 1.0
 **/
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){

        //从多个红包当中随便抽取一个，给我自己，随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);

        //当前成员自己有多少钱,加上领取的红包 等于自己红包余额
        int money = super.getMoney() + delta;
        super.setMoney(money);

    }
}
