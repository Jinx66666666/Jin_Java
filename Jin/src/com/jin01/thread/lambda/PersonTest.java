package com.jin01.thread.lambda;

import java.util.Arrays;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/01/10  14:28:51
 * @Version: 1.0
 **/
public class PersonTest {

    public static void main(String[] args) {
        Person[] arr = {
                new Person("Jin" ,18),
                new Person("JinX" ,16),
                new Person("Jhin" ,22)
        };
        //使用匿名内部类
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        //使用lambda表达式
        /*Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });*/
//        使用优化后的lambda表达式
        Arrays.sort(arr,(o1,o2)->o1.getAge() - o2.getAge());
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
