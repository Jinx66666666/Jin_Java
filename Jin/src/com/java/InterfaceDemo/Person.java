package com.java.InterfaceDemo;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/18  14:57:19
 * @Version: 1.0
 **/
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*@Override
    public boolean equals(Object obj){
        if (obj == this){//传递参数如果是this本身，直接返回true，提高程序效率
            return true;
        }
        if (obj == null){//传递的参数obj如果是null，直接返回false，提高程序效率
            return false;
        }
        if (obj instanceof Person){//增加一个判断，防止类型转换一次classCastException
            Person P = (Person) obj;//使用向下转型，把obj转为Persion类型
            boolean b = this.name.equals(P.name) && this.age == P.age;//比较两个对象的属性，一个对象是this（p1），另一个对象是p2（obj -> p2）
            return b;
        }
        return false;

    }*/

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass()!=o.getClass()使用反射技术，判断o是否是Persion类型  等效于obj instanceof Persion
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
