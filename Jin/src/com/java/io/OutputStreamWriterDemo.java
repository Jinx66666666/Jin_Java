package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Description: 字符通向字节流的桥梁，字节输出转换流
 * @author: HuangJing
 * @date: 2020/02/09  21:13:44
 * @Version: 1.0
 **/
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Jin\\\\src\\\\com\\\\jin01\\\\io\\\\utf.txt"), "utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
