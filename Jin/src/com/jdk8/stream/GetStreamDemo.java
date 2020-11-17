package com.jdk8.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description: 获取流
 * @author: HuangJing
 * @date: 2020/02/15  11:41:24
 * @Version: 1.0
 **/
public class GetStreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//把集合转换成stream流
        Stream<String> stream1 = list.stream();

        HashSet<String> hashSet = new HashSet<>();
        Stream<String> stream2 = hashSet.stream();

        Map<String, String> map = new HashMap<>();

        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();//获取键值对（键与值的映射关系 entry）
        Stream<Map.Entry<String, String>> stream5 = entrySet.stream();
//        把数组转换成Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(stream6);

        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] strArr = {"我","你","他","她"};
        Stream<String> stream8 = Stream.of(strArr);
    }
}
