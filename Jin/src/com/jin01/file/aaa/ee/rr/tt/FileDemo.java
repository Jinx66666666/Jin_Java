package com.jin01.file.aaa.ee.rr.tt;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/01/13  14:21:36
 * @Version: 1.0
 **/
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02("c:\\","a.txt");
//        show03();
//        show04();
//        show05();
//        show06();
//        show07();
//        show08();
//        show09();
        show10();
    }

    private static void show01() {
        File file = new File("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png");
        File file1 = new File("1.png");
        String absoluteFile = file.getAbsolutePath();
        String absoluteFile1 = file1.getAbsolutePath();
        System.out.println(absoluteFile);//返回绝对路径
        System.out.println(absoluteFile1);//返回绝对路径
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show03() {
        File file = new File("c:\\");
        File file1 = new File(file, "Hello.java");
        System.out.println(file1);
    }

    private static void show04() {
        File file = new File("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png");
        File file1 = new File("1.png");
        String absoluteFile = file.getPath();
        String absoluteFile1 = file1.getPath();
        System.out.println(absoluteFile);//返回绝对路径
        System.out.println(absoluteFile1);//返回绝对路径
    }

    private static void show05() {
        File file = new File("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png");
        File file1 = new File("C:\\Users\\12159\\Pictures\\Saved Pictures\\2.png");
        long length = file.length();
        long length1 = file1.length();
        System.out.println(length);//返回绝对路径
        System.out.println(length1);//返回绝对路径
    }

    private static void show06() {
        File file = new File("D:\\Jin-project\\Jin\\src\\com\\jin01\\file");
        System.out.println(file.exists());
    }
    private static void show07() throws IOException {
        File file = new File("D:\\Jin-project\\Jin\\src\\com\\jin01\\file\\12.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

    }
    private static void show08() throws IOException {
        File file = new File("Jin\\src\\com\\jin01\\file\\aaa");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        File file1 = new File("Jin\\src\\com\\jin01\\file\\aaa\\ee\\rr\\tt");
        boolean mkdirs = file1.mkdirs();
        System.out.println(mkdirs);


    }
    private static void show09() throws IOException {
        File file = new File("Jin\\src\\com\\jin01\\file\\1.txt");
        boolean del = file.delete();
        System.out.println(del);
      /*  File file1 = new File("Jin\\src\\com\\jin01\\file\\aaa\\ee\\rr\\tt");
        boolean mkdirs = file1.mkdirs();
        System.out.println(mkdirs);
*/

    }
    private static void show10() {
        File file = new File("D:\\Jin-project\\Jin\\src\\com\\jin01\\file");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println("=================");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
