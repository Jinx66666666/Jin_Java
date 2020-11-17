package com.jdk8.stream;

import java.util.ArrayList;

/**
 * @Description: 传统方式
 * @author: HuangJing
 * @date: 2020/02/15  16:12:34
 * @Version: 1.0
 **/
public class StreamTest {
    public static void main(String[] args) {
//        第一只队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("伊泽瑞尔");
        one.add("德玛西亚");
        one.add("亚索");
        one.add("奥巴马");
        one.add("暗裔剑魔");
//        取名字为4个字的成员，存储到一个集合中
        ArrayList<String> one1 = new ArrayList<>();
        for (String s : one) {
            if (s.length() == 4) {
                one1.add(s);
            }
        }
//        在筛选前三个人，存储到一个新的集合中
        ArrayList<String> team1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            team1.add(one1.get(i));
        }
        //第二支队伍
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("张三丰");
        list.add("张无忌");
        list.add("张三");
        list.add("张飞鸿");
        list.add("杨过");
//        取姓张的成员，存储到一个集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }
//        筛选不要前2个，存储到一个新的集合中
        ArrayList<String> team2 = new ArrayList<>();
        for (int i = 2; i < list1.size(); i++) {
            team2.add(list1.get(i));
        }
        //合并
        ArrayList<String> all = new ArrayList<>();
        all.addAll(team1);
        all.addAll(team2);
//        创建Persion对象，存储到新的集合中
        ArrayList<Persion> persion = new ArrayList<>();
        for (String s : all) {
            persion.add(new Persion(s));
        }
//        打印Persion对象信息
        for (Persion p : persion) {
            System.out.println(p);
        }
    }
}
