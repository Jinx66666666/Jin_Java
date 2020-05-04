package com.jin01.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: 字符流
 * @author: HuangJing
 * @date: 2020/02/07  21:12:03
 * @Version: 1.0
 **/
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /**
     * @param
     * @Description:字符输入流
     * @return: void
     */
    private static void show01() throws IOException {
        FileReader fileReader = new FileReader("Jin\\src\\com\\jin01\\io\\aaa.txt");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
    }

    /**
     * @param
     * @Description:字符输出流
     * @return: void
     */
    private static void show02() throws IOException {
        FileWriter fileWriter = new FileWriter("Jin\\src\\com\\jin01\\io\\aaa.txt", true);
        fileWriter.write(97);
        fileWriter.write("我爱你");
        fileWriter.write("我爱你", 1, 2);
        for (int i = 0; i < 10; i++) {
            fileWriter.write("我爱你" + i + "\r\n");
        }
//        fileWriter.flush();//刷新缓冲区，流对象可以继续使用
        fileWriter.close();//先刷新，然后通知系统释放资源，流对象就不能使用
//        fileWriter.write(97);
    }

    /**
     * @param
     * @Description:处理流中的异常
     * @return: void
     */
    private static void show03() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Jisadf n\\src\\com\\jin01\\io\\aaa.txt");
            for (int i = 0; i < 10; i++) {
                fw.write("我爱你" + i + "\r\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {//优化，防止java.lang.NullPointerException
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     *
     * @Description:JDK7优化异常
     *  try后面添加一个（）  在括号内定义流对象，这个流对象的作用域就在try中有效
     *  重点：try中的代码执行完毕，会自动把流对象释放，不用写finally格式  和.close();
     * @param 
     * @return: void
     *      
     *
     */
    private static void show04() {
        try(FileWriter fw = new FileWriter("Jin\\src\\com\\jin01\\io\\aaa.txt");) {
            for (int i = 0; i < 10; i++) {
                fw.write("我爱你" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
