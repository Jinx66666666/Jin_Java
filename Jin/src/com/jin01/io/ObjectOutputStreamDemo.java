package com.jin01.io;


import java.io.*;
import java.util.ArrayList;


/**
 * @Description: 序列化和反序列化流
 * @author: HuangJing
 * @date: 2020/02/10  22:11:42
 * @Version: 1.0
 **/
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() throws IOException, ClassNotFoundException {
        ArrayList<Persion> list = new ArrayList<>();
        list.add(new Persion("Jin",18));
        list.add(new Persion("JinX",19));
        list.add(new Persion("JinY",21));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt"));
        Object o = ois.readObject();
        ArrayList<Persion> persion = (ArrayList<Persion>) o;
        for (Persion p : persion) {
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }

    private static void demo02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Persion persion = (Persion) o;
        System.out.println(persion.getName()  +  persion.getAge());

    }

    private static void demo01() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt"));
        oos.writeObject(new Persion("\r\n 余小鱼:\n" +
                "如果遇到了让我觉得安心的人\n" +
                "\n" +
                "余小鱼:\n" +
                "那他的样子就是我喜欢的样子\n",22));
        oos.close();

    }
}
