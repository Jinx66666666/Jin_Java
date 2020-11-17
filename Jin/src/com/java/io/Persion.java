package com.java.io;

import java.io.Serializable;

/**
 * @Description: 序列化测试类
 * @author: HuangJing
 * @date: 2020/02/10  22:13:49
 * @Version: 1.0
 **/
public class Persion implements Serializable {
    static final long serialVersionUID = 1L;
    private String name;
    public int age;

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persion() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persion{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
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
}
