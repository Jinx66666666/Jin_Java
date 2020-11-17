package com.java.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Description: 输出流
 * @author: HuangJing
 * @date: 2020/01/16  10:15:54
 * @Version: 1.0
 **/
public class OutputStreamDemo {

    @Test
    public void test01() throws IOException {
        /**
         * 调用系统功能创建了文件
         * 创建了字节输出流对象
         * 让字节输出流对象指向创建好的文件
         */
        FileOutputStream fileOutputStream = new FileOutputStream("Jin\\src\\com\\java\\io\\txt\\OutputStreamDemo.txt");
        //等同于
//        FileOutputStream fos = new FileOutputStream(new File("Jin\\src\\com\\java\\io\\jin01.txt"));
//        write()三种使用
        fileOutputStream.write(97);
        fileOutputStream.write("为你千千万万遍".getBytes());

        byte[] b = {97, 98, 99, 100};
        fileOutputStream.write(b);

        fileOutputStream.write(b, 0, b.length);
        fileOutputStream.write(b, 1, 1);

//        字节流写数据的两个小问题
        /**
         * 换行
         * 1.Window:  \r\n
         * 2.Linux:     \n
         * 3.mac:       \r
         */
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.write("痛苦进入身体，统统熬成了温柔！".getBytes());
        }
        fileOutputStream.close();
    }

    /**
     * 追加写入
     * public FileOutputStream(String name, boolean append)
     * throws FileNotFoundException
     * {
     * this(name != null ? new File(name) : null, append);
     * }
     * 如果第二个参数为true 即append为true
     * 则字节将写入文件的末尾而不是开头
     *
     * @param
     * @throws IOException
     */

    @Test
    public void test02() {
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("Z:\\Jin\\src\\com\\java\\io\\OutputStreamDemo.txt", true);
            fos = new FileOutputStream("Jin\\src\\com\\java\\io\\OutputStreamDemo.txt", true);
            for (int i = 0; i < 10; i++) {
                fos.write("\r\n".getBytes());
                fos.write("梦里出现的人，醒来时就该去见他".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {//为防止NullPointerException
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /**
     * @param
     * @Description:转换流
     * @return: void
     */
    private static void show03() throws IOException {
        FileReader fileWriter = new FileReader("Jin\\src\\com\\jin01\\io\\GBK.txt");
        int len = 0;
        while ((len = fileWriter.read()) != -1) {
            System.out.print((char) len);
        }
        fileWriter.close();
    }

    private static void show01() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt");
        fileOutputStream.write(97);

        byte[] bytes = {65, 66, 67, 68, 69};
        fileOutputStream.write(bytes);
        /*把字节组的一部分写入到文件中，
        int off ：数组的开始索引
        int len写几个字节*/
//        byte[] getBytes() 把字符串转为字节数组
        byte[] b2 = "你好".getBytes();
        System.out.println(b2);
        System.out.println(Arrays.toString(b2));
        fileOutputStream.write(b2);
        fileOutputStream.write(bytes, 1, 2);//把字节数组的一部分写到文件中
        fileOutputStream.close();
//        new File("Jin\\src\\com\\jin01\\io\\aaaa.txt").delete();
    }

    private static void show02() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Jin\\src\\com\\jin01\\io\\aaa.txt");
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("我爱你".getBytes());
            fileOutputStream.write("\r\n".getBytes());//换行
        }
        fileOutputStream.close();
    }
}
