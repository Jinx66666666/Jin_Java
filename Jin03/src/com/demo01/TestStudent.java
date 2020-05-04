package com.demo01;

/**
 * @Description: 为你千千万万遍
 * @author: HuangJing
 * @date: 2019/12/4  15:31:51
 * @Version: 1.0
 **/
public class TestStudent {

    public static void main(String[] args) {
        Student stu = new Student();
//        stu.eat();

//        stu.name = "黄晶";
//        stu.age = 18;//错误写法
        stu.setName("黄晶");
        stu.setAge(18);
        stu.setMale(true);
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.isMale());
        stu.eat("德玛西亚");
        stu.sleep("疾风剑豪");
        System.out.println("=========");
        System.out.println(stu);

        Student stu2 = new Student("亚索",19);
        System.out.println("我是" + stu2.getName() + " 今年 " + stu2.getAge());
        stu2.setAge(20);
        System.out.println("我是" + stu2.getName() + " 今年 " + stu2.getAge());


    }
}
