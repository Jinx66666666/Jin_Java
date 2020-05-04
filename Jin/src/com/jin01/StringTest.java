package com.jin01;

/**
 * @Description: 字符串
 * @author: HuangJing
 * @date: 2019/12/11  16:22:55
 * @Version: 1.0
 **/
public class StringTest {

    public static void main(String[] args) {
        String str = "Jin";
        System.out.println(str.equals("Jin"));
        System.out.println(str.length());

        char[] chars = "Jin".toCharArray();
        System.out.println(chars[0]);

        byte[] bytes = "JIN".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String s = "how are you?";
        String replace = s.replace("o", "@");
        System.out.println(replace);
        System.out.println("===============");

        String str3 = "HUANG,JING";
        String[] split = str3.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String str4 = "wo.ai.ni";
        String[] split1 = str4.split("\\.");
        for (int i = 0; i < split1.length; i++) {

            System.out.println(split1[i]);

        }
        int id = Student.id;
        System.out.println(id);
        Student.getMethod(4);

        Student student = new Student("黄晶",18);

        student.getMet();
        student.getMethod(8);
        Student.id = 4;


    }
}
