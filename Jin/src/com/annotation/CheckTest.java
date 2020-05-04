package com.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/16  16:50:38
 * @Version: 1.0
 **/
public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();//创建计算计数器对象
        Class aClass = c.getClass();//获取字节码文件对象
        Method[] methods = aClass.getMethods();//获取所有方法
        int num = 0;//记录出现的异常
        BufferedWriter bw = new BufferedWriter(new FileWriter("Jin\\src\\bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {//判断方法是否有Check注解
                try {
                    method.invoke(c);
                } catch (Exception e) {
//                    e.printStackTrace();
                    num++;
                    bw.write(method.getName()+"XXX方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称"+e.getCause().getClass().getSimpleName());//获取简短类名（不带包名的名称）
                    bw.newLine();
                    bw.write("异常的原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------- ---------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现" + num + "次异常");
        bw.flush();
        bw.close();
    }
}
