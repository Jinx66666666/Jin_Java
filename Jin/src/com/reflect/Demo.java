package com.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/16  12:37:48
 * @Version: 1.0
 **/
public class Demo {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        ClassLoader classLoader = Demo.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);
        String className = properties.getProperty("className");
        String methodNmae = properties.getProperty("methodName");
        String string1 = properties.getProperty("string");
        Class aClass = Class.forName(className);
        Object obj = aClass.newInstance();
        Method method = aClass.getMethod(methodNmae, string1.getClass());
        method.invoke(obj,string1);
    }
}
