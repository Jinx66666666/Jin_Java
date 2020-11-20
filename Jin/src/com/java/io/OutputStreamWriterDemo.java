package com.java.io;

import org.junit.Test;

import java.io.*;

/**
 * @Description: 字符通向字节流的桥梁，字节输出转换流
 * @author: HuangJing
 * @date: 2020/02/09  21:13:44
 * @Version: 1.0
 **/
public class OutputStreamWriterDemo {

    @Test
    public void test04() throws IOException {
        FileReader fileReader = new FileReader("Jin/CopyAviDemo.java");
        FileWriter fileWriter = new FileWriter("Jin/CopyAviDemo1.java");

        char[] chars = new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1){
            fileWriter.write(chars,0,len);
        }
        fileWriter.close();
        fileReader.close();
    }

    @Test
    public void test03() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("Jin\\src\\com\\java\\io\\OutputStreamWriterDemo.java"), "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("Jin\\src\\Jinxx.java"), "UTF-8");
        int ch;

        while ((ch = inputStreamReader.read()) != -1) {
            outputStreamWriter.write(ch);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }

    @Test
    public void test02() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Jin\\src\\com\\java\\io\\txt\\OutputStreamWriter.txt"), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    @Test
    public void test01() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Jin\\src\\com\\java\\io\\txt\\OutputStreamWriter.txt"), "UTF-8");
        osw.write("中国");
        osw.write(97);
        osw.flush();//刷新流,刷新之后可以继续写入
        osw.write(98);
        osw.write(99);
        osw.close();//关闭流，关闭前先刷新流，关闭后不能再写入
//        osw.write(99);//java.io.IOException: Stream closed
    }

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
