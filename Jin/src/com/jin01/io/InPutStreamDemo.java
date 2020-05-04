package com.jin01.io;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: 复制 及输入流
 * @author: HuangJing
 * @date: 2020/01/20  10:52:52
 * @Version: 1.0
 **/
public class InPutStreamDemo {
    public static void main(String[] args) throws IOException {
        show01();
//        show02();
//        show03();
    }

    private static void show() throws IOException { //一次读一个字节
        long s = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\1.png");
//        byte[] bytes = new byte[1024];
        int len = 0;
        //len 表示记录读取到的字节个数，不能写成while（fileInputStream.read(bytes)) != -1）{}
        // 因为没执行fileInputStream.read指针想后读一位
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long e = System.currentTimeMillis();
        System.out.println("使用时间：" + (e - s));
    }

    private static void show01() throws IOException {//一次读所有字节
        long s = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\1.png");
        byte[] bytes = new byte[1024];
        int len = 0;
        //len 表示记录读取到的字节个数，不能写成while（fileInputStream.read(bytes)) != -1）{}
        // 因为没执行fileInputStream.read指针想后读一位
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long e = System.currentTimeMillis();
        System.out.println("使用时间：" + (e - s));
    }

    /**
     * @param
     * @Description:一次读一个字节
     * @return: void
     */
    public void show02() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt");
        int len = 0;
        while ((len = fileInputStream.read()) != -1) {
            System.out.println((char) len);
        }
    }

    /**
     * @param
     * @Description:一次读所有
     * @return: void
     */
    @Test
    public void show03() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            
            System.out.println(new String(bytes, 0, len));
        }
        fileInputStream.close();
    }
}
