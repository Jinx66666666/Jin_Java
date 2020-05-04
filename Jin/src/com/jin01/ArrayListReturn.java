package com.jin01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/10  16:27:18
 * @Version: 1.0
 **/
public class ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        System.out.println(bigList);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            bigList.add(num);
        }
        System.out.println(bigList);

        ArrayList<Integer> smallNum = getSmallNum(bigList);
        System.out.println(smallNum);

    }
    public static ArrayList<Integer> getSmallNum(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i)%2 == 0){
                smallList.add(bigList.get(i ));
            }
        }
        return smallList;
    }
}
