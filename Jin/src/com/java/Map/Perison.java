package com.java.Map;

import java.util.Objects;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/28  15:51:03
 * @Version: 1.0
 **/
public class Perison {
    private String name;
    private int age;

    public Perison(String name, int age) {
        this.name = name;
        this.age = age;
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
        final StringBuilder sb = new StringBuilder("Perison{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perison perison = (Perison) o;
        return age == perison.age &&
                Objects.equals(name, perison.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
