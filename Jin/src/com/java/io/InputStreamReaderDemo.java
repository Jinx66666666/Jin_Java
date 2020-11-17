package com.java.io;

import java.io.*;

/**
 * @Description: 字节输入转换流
 * @author: HuangJing
 * @date: 2020/02/09  21:27:42
 * @Version: 1.0
 **/
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        demo();
        demo01();
    }
/**
 * @Description:将GBK编码文件，转换为UTF-8的文本文件
 * @param
 * @return: void
 */
    private static void demo01() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\GBK.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\utf.txt"));
        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }

    private static void demo() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\GBK.txt"),"gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char) len);
        }
        isr.close();
    }

}
