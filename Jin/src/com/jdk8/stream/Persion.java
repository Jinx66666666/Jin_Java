package com.jdk8.stream;

/**
 * @Description: Persion类
 * @author: HuangJing
 * @date: 2020/02/15  16:36:00
 * @Version: 1.0
 **/
public class Persion {
    private String name;

    public Persion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persion{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
