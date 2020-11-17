package com.java.recurison;

import java.io.File;
import java.io.FileFilter;

/**
 * @Description: 递归
 * @author: HuangJing
 * @date: 2020/01/14  14:37:41
 * @Version: 1.0
 **/
public class RecurisonDemo {
    public static void main(String[] args) {

//        a();

//        b(1);

/*        int sum = sum(23);
        System.out.println(sum);*/

/*        int jc = jc(5);
        System.out.println(jc);*/

        File file = new File("D:\\Jin-project\\Jin\\src\\com\\jin01\\file");
        lambdaFilter(file);

    }
    private static void lambdaFilter(File dir){
        File[] files = dir.listFiles((File pathname)->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        for (File file : files) {
            if (file.isDirectory()) {
                lambdaFilter(file);
            }else {
                System.out.println(file);
            }

        }

    }
/**
 *
 * @Description:使用匿名内部类
 *
 * @param dir
 * @return: void
 *
 *
 */
    private static void niFilter(File dir){
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File file : files) {
            if (file.isDirectory()) {
                niFilter(file);
            }else {
                System.out.println(file);
            }

        }
    }
    /**
     * @param dir
     * @Description:使用过滤器
     * @return: void
     */
    private static void getFilter(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()) {
                getFilter(file);
            }else{
                System.out.println(file);
            }
        }
    }
    /**
     * @param dir
     * @Description:过滤
     * @return: void
     */
    private static void getAllFileYou(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFileYou(file);
            } else {
                if (file.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(file);
                }
            }
        }
    }

    private static void getAllFileJava(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFileJava(file);
            } else {
                String s = file.toString();
                boolean b = s.endsWith(".java");
                if (b) {
                    System.out.println(file);
                }
            }
        }
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }

    private static int jc(int i) {
        if (i == 1) {
            return 1;
        }
        return i * jc(i - 1);
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }

        return i + sum(i - 1);
    }

    private static void a() {
        System.out.println("啊啊啊啊啊");
        a();
    }

    private static void b(int i) {
        System.out.println(i);
        if (i == 1000) {
            return;
        }
        b(++i);
    }
}
