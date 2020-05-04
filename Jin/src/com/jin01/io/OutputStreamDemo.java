package com.jin01.io;

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
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }
/**
 *
 * @Description:转换流
 *
 * @param
 * @return: void
 *
 *
 */
    private static void show03() throws IOException {
        FileReader fileWriter = new FileReader("Jin\\src\\com\\jin01\\io\\GBK.txt");
        int len = 0;
        while ((len = fileWriter.read()) != -1){
            System.out.print((char) len);
        }
        fileWriter.close();
    }

    private static void show01()throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\aaa.txt");
        fileOutputStream.write(97);

        byte[] bytes = {65,66,67,68,69};
        fileOutputStream.write(bytes);
        /*把字节组的一部分写入到文件中，
        int off ：数组的开始索引
        int len写几个字节*/
//        byte[] getBytes() 把字符串转为字节数组
        byte[] b2 = "你好".getBytes();
        System.out.println(b2);
        System.out.println(Arrays.toString(b2));
        fileOutputStream.write(b2);
        fileOutputStream.write(bytes,1,2);//把字节数组的一部分写到文件中
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
