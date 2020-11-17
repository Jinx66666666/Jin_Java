package com.java.Map;

import java.util.*;

/**
 * @Description: Map
 * @author: HuangJing
 * @date: 2019/12/28  11:44:00
 * @Version: 1.0
 **/
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();

        map.put("提莫","小炮");
        map.put("光辉","伊泽瑞尔");
        map.put("光辉","盖伦");
        map.put("蛮王","艾希");


//        show(map);
//        show1();
//        show2();
        show3();
    }
    /**
     *
     * @Description:
     *
     * @param map
     * @return: void
     *
     *
     */
    private static void show(Map<String , String> map){

        String s = map.remove("蛮王");
        System.out.println(s);
        System.out.println(map);
        System.out.println("==========================");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            String s1 = map.get(next);
            System.out.println(s1);
        }
        System.out.println("====================");
        for (String s1 : map.keySet()) {
            String s2 = map.get(s1);
            System.out.println(s1 + " =  " + s2);

        }
    }
    private static void show1(){
        Map<String, Integer> map = new HashMap<>();
        map.put("艾希",18);
        map.put("艾希1",180);
        map.put("艾希2",1800);
        map.put("艾希3",18000);
        map.put("艾希4",180000);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key);
            System.out.println(value);
        }
        System.out.println("===========");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = "+ entry.getValue());
        }

    }
    private static void show2(){
        Map<String, Perison> map = new HashMap<>();
        map.put("弗雷尔卓德",new Perison("艾希",19));
        map.put("艾欧尼亚",new Perison("艾瑞莉娅",19));
        map.put("德玛西亚",new Perison("光辉",19));
        map.put("祖安",new Perison("艾克",19));
        map.put("祖安",new Perison("蒙多",18));

        Set<String> set = map.keySet();
        for (String s : set) {
            Perison value = map.get(s);
            System.out.println(value);
        }
    }
    private static void show3(){
        Map<Perison, String> map = new HashMap<>();
        map.put(new Perison("艾希",19),"弗雷尔卓德");
        map.put(new Perison("艾瑞莉娅",19),"艾欧尼亚");
        map.put(new Perison("光辉",19),"德玛西亚");
        map.put(new Perison("光辉",19),"德玛西亚");

        Set<Perison> set = map.keySet();
        for (Perison s : set) {
            String value = map.get(s);
            System.out.println(value);
        }
    }

}
