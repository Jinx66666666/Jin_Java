package com.jin01.DouDIZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Description: 斗地主（单列）
 * @author: HuangJing
 * @date: 2019/12/26  10:32:06
 * @Version: 1.0
 **/
public class Danlie {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"A", "2", "J", "Q", "K", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (String c : color) {
            for (String s : numbers) {
//                System.out.println(c + s);
                poker.add(c + s);
            }
        }
        System.out.println(poker);
        Collections.shuffle(poker); //洗牌
        System.out.println("洗牌后：  "+poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51){
                last.add(s);
            }else if (i % 3 == 0){
                player1.add(s);
            }else if (i%3 == 1){
                player2.add(s);
            }else if(i%3 == 2){
                player3.add(s);
            }
        }
        System.out.println("玩家1： " + player1);
        System.out.println("玩家2 ： " + player2);
        System.out.println("玩家3： " + player3);
        System.out.println("底牌： " + last);

    }
}
