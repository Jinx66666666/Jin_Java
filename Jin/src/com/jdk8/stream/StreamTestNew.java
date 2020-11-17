package com.jdk8.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description: Stream流处理数据
 * @author: HuangJing
 * @date: 2020/02/15  16:49:33
 * @Version: 1.0
 **/
public class StreamTestNew {
    public static void main(String[] args) {
        //第一只队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("伊泽瑞尔");
        one.add("德玛西亚");
        one.add("亚索");
        one.add("奥巴马");
        one.add("暗裔剑魔");
//        one.stream().filter(name -> name.length() == 4).limit(3).forEach(s -> System.out.println(s));//打印处理后的集合，没有返回值
        Stream<String> team1 = one.stream().filter(name -> name.length() == 4).limit(3);
        //第二支队伍
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("张三丰");
        list.add("张无忌");
        list.add("张三");
        list.add("张飞鸿");
        list.add("杨过");
//        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(s -> System.out.println(s));//打印处理后的集合，没有返回值
        Stream<String> team2 = list.stream().filter(s -> s.startsWith("张")).skip(2);
 //       合并方法一：
//        创建新的Persion对象，存储到一个新的集合中,然后合并流，在数据处理成添加到all对象集合中
        /*ArrayList<Persion> all = new ArrayList<>();
        Stream<String> stream = Stream.concat(team1, team2);
        stream.forEach(s -> all.add(new Persion(s)));
        all.forEach(s-> System.out.println(s));*/
//       方法二：
//        合并到一个队伍，存储到Persion对象中，然后打印Persion对象信息
        Stream.concat(team1,team2).map(s -> new Persion(s)).forEach(s-> System.out.println(s));
    }
}
