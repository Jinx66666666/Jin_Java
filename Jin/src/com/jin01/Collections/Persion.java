package com.jin01.Collections;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/28  09:56:11
 * @Version: 1.0
 **/
public class Persion implements Comparable<Persion>{
    private String name;
    private int age;

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persion() {
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persion{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Persion o) {
        return this.getAge() - o.getAge();
    }


}
