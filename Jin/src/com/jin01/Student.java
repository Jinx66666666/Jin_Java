package com.jin01;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/10  11:27:00
 * @Version: 1.0
 **/
public class Student {

    private String name;
    private int age;
    static int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void getMethod(int id){
        System.out.println("静态使用");
        System.out.println(id);
    }

    public void getMet(){
        System.out.println("成员方法");
    }
}
