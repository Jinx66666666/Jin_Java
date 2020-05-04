package com.jin01.io;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/**
 * @Description: 缓冲流
 * @author: HuangJing
 * @date: 2020/02/08  21:53:45
 * @Version: 1.0
 **/
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
//        demo01();
//        demo02();
//        demo03();
//        demo04();
//        demo05();
        demo06();
    }

    private static void demo06() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Jin\\src\\com\\jin01\\io\\aaa.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Jin\\src\\com\\jin01\\io\\out.txt"));
        HashMap<String, String> map = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        reader.close();
    }

    private static void demo05() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Jin\\src\\com\\jin01\\io\\aaa.txt"));
       /* String line = reader.readLine();
        System.out.println(line);
        line = reader.readLine();
        System.out.println(line);
        line = reader.readLine();
        System.out.println(line);
        line = reader.readLine();
        System.out.println(line);*/
       String line;
       while ((line = reader.readLine()) != null){
           System.out.println(line);
       }
        reader.close();
    }

    /**
 *
 * @Description:字节缓冲输出流
 *
 * @param
 * @return: void
 *
 *
 */
    private static void demo04() throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt"));
        for (int i = 0; i < 10; i++) {
            outputStream.write("为你千千万万遍" + "\r\n");
            outputStream.newLine();
        }
        outputStream.flush();
    }
/**
 *
 * @Description:字节缓冲流复制图片
 *
 * @param
 * @return: void
 *
 *
 */
    private static void demo03() throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\12159\\Pictures\\Saved Pictures\\1.png"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1.png"));
        byte[] bytes = new byte[1024];
        int len = 0;
        //len 表示记录读取到的字节个数，不能写成while（fileInputStream.read(bytes)) != -1）{}
        // 因为没执行fileInputStream.read指针想后读一位
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        outputStream.close();//先关输出缓冲流 ，因为如果写写完了，读取肯定0完毕了
        inputStream.close();
        long e = System.currentTimeMillis();
        System.out.println("使用时间：" + (e - s));
    }
/**
 *
 * @Description:字符缓冲输入流
 *
 * @param
 * @return: void
 *
 *
 */
    private static void demo02() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt");
        BufferedInputStream stream = new BufferedInputStream(fileInputStream);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = stream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        stream.close();
    }

    /**
     * @param
     * @Description:字节输出流
     * @return: void
     */
    private static void demo01() throws IOException {
        FileOutputStream fileWriter = new FileOutputStream("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileWriter);
        bufferedOutputStream.write("小不点".getBytes());
        bufferedOutputStream.flush();
    }
    @Test
    public void wangyuwei() throws IOException {
        File file = new File("D:\\Jin-project\\Jin\\src\\com\\jin01\\io\\aaa.txt");
        File absoluteFile = file.getAbsoluteFile();
        BufferedReader reader = new BufferedReader(new FileReader(absoluteFile));
        HashMap<String, String> map = new HashMap<>();
        String line ;
        while ((line = reader.readLine()) != null){
            String[] split = line.split(" ");
            map.put(split[0],split[1]);
        }
        for (String s : map.keySet()) {
            System.out.println("key值为：" + s + " value为：" +  map.get(s));
        }
    }
}
