package com.jin01.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: Propertie集合
 * @author: HuangJing
 * @date: 2020/02/08  14:26:48
 * @Version: 1.0
 **/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
//        demo01();
        demo02();
    }
    private static void demo01() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("Jin","黄晶");
        properties.setProperty("JinX","黄敬");
        properties.setProperty("JinY","黄敬一");
        FileWriter fileWriter = new FileWriter("D:\\Jin-project\\Jin\\src\\com\\jin01\\properties\\jin.txt");
        properties.store(fileWriter,"save data");
        fileWriter.close();

    }
    private static void demo02() throws IOException {
        FileReader fileReader = new FileReader("D:\\Jin-project\\Jin\\src\\com\\jin01\\properties\\jin.txt");
        Properties properties = new Properties();
        properties.load(fileReader);
        Set<String> set = properties.stringPropertyNames();//获取所有键的名称的集合
        for (String s : set) {
            String value = properties.getProperty(s);
            System.out.println(s  + "==="  + value);
        }
    }
}
