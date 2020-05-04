package com.jin01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description: Collections测试
 * @author: HuangJing
 * @date: 2019/12/28  09:47:56
 * @Version: 1.0
 **/
public class PersionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Collections.addAll(arrayList,9,4,7,2,3);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);*/
//        demo1();
//        demo2();
        demo3();
    }
    /**
     *
     * @Description: Comparable
     *
     * @param
     * @return: void
     *
     *
     */
    private static void demo1(){
        Persion persion = new Persion("Jin",18);
        Persion persion1 = new Persion("棉签",30);
        Persion persion2 = new Persion("手套",22);
        ArrayList<Persion> list = new ArrayList<>();
        Collections.addAll(list,persion,persion1,persion2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
    /**
     *
     * @Description:
     *
     * @param
     * @return:
     *
     *
     */
    private static void demo2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(6);
        System.out.println(list);
/*        Collections.sort(list, new Comparator<Integer>() {
            @Override //重写比较规则
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //升序
            }
        });*/
        Collections.sort(list,(o1,o2) ->o1 - o2);
        System.out.println(list);
    }

    private static void demo3(){
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("亚索",12);
        Student student1 = new Student("艾维尼亚",16);
        Student student2 = new Student("烬",15 );
        Collections.addAll(list,student,student1,student2);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
    }
}

