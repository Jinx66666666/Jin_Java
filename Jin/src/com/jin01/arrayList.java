package com.jin01;

import java.util.ArrayList;

/**
 * @Description: 数组
 * @author: HuangJing
 * @date: 2019/12/6  16:18:32
 * @Version: 1.0
 **/
public class arrayList {
    /**
     *
     * @Description:
     *数组的长度是不可以改变的
     * 但是ArrayList集合的长度是可以随意改变的。
     * 对于ArrayList 来说，有一个尖括号<E>代表泛型
     * 注意：泛型只能是引用类型，不能是基本类型
     *
     * 注意事项：
     * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容，
     * 如果内容是空，得到的是[]
     * @param args
     * @return: void
     *
     *
     */
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //备注： 从JDK 1.7+ 开始，右侧的尖括号内容可以不写内容但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("黄晶");
        list.add("lalladfa");
        list.add("lalladfa");
        list.add("lalladfa");
        list.add("lalladfa");
        list.add("lalladfa");

        String  remove = list.remove(4);
        System.out.println("移除" + remove);

        String s = list.get(0);
        System.out.println(s);

        int size = list.size();
        System.out.println(size);

        System.out.println(list);

        System.out.println("++++++++++++++++++++++++");

        ArrayList<Student> arrayList = new ArrayList<>();

        Student one = new Student("德玛西亚", 44);
        Student two = new Student("啦啦啦", 44);
        Student three = new Student("盖伦", 44);
        Student four = new Student("大保健", 44);
        Student five = new Student("草丛伦", 44);

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(five);

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println("姓名"+student.getName() + "年龄" + student.getAge());

        }
    }
}
