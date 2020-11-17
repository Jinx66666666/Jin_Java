package com.java.Date;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/24  09:20:48
 * @Version: 1.0
 **/
public class CollectionDome {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);
        collection.add("Jin");
        System.out.println(collection);
        boolean jin = collection.contains("Jin");
        System.out.println(jin);
        boolean empty = collection.isEmpty();
        System.out.println(empty);

        int size = collection.size();
        System.out.println(size);
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        collection.clear();
        System.out.println(collection.isEmpty());


    }
}
