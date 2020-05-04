package com.jin01.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Description: 打印流
 * @author: HuangJing
 * @date: 2020/02/11  17:00:35
 * @Version: 1.0
 **/
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        demo01();
        demo02();
    }

    private static void demo02() throws FileNotFoundException {
        System.out.println("我在打印台输出");
        PrintStream ps = new PrintStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt");
        ps.write(97);
        ps.println("我在打印流的目的地中输出");
        System.setOut(ps);//把输出语句的目的地改变成打印流的目的地
        System.out.println("我也在打印流的目的地中输出");
        ps.close();
    }

    private static void demo01() throws FileNotFoundException {
        PrintStream ps = new PrintStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt");
        ps.write(97);//继承父类write()方法写数据，查看数据的时候会查询码表
        ps.println(97);//使用自己特有的方法写数据，打印数据原样输出
        ps.println(97);
        ps.close();

    }
}
