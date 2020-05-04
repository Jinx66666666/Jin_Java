package com.demo01;

/**
 * @Description: 为你千千万万遍
 * @author: HuangJing
 * @date: 2019/12/4  09:05:03
 * @Version: 1.0
 **/
public class Student {
    private String name;
    private int age;
    private boolean male;

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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void  eat(String name){
        System.out.println("我是"+name + "，你是 " + name);
    }

    public void sleep (String name){
        System.out.println("我是"+name + "，你是 " + this.name);
        System.out.println(this);
    }
    /*构造方法*/
    public Student (){
        System.out.println("构造方法执行了");
    }

    public Student (String name , int age){
        System.out.println("爱你千千万万遍");
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
}
