package com.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/16  12:01:33
 * @Version: 1.0
 **/
public class ReflectTest {
    public static void main(String[] args) throws Exception {
//       加载配置文件，创建Properties对象
        Properties properties = new Properties();
        //加载配置文件，转换为一个集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);
        //获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
//        加载该类的内存
        Class aClass = Class.forName(className);
        //创建对象
        Object obj = aClass.newInstance();
        //获取方法对象
        Method method = aClass.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
