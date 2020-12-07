package com.java.io.copy;

import java.io.*;


/**
 * @ClassName CopyFolders
 * @program: Jin_Java
 * @Description: 复制多级文件夹
 * @author: Jin
 * @Date: 2020/12/7 15:43
 * @version: V1.0
 */
public class CopyFolders {

    public static void main(String[] args) {
        File srcFile = new File("E:\\OneDrive\\04_回首频思忆\\Pixiv");
        File destFile = new File("E:\\");
        copyFolder(srcFile, destFile);
    }

    private static void copyFolder(File srcFile, File destFile) {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFile = new File(destFile, srcFileName);
            if (!newFile.exists()) {
                newFile.mkdir();
            }

            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file, newFile);
            }
        } else {
            //说明是文件，直接复制，用字节缓冲流
            File newFile = new File(destFile, srcFile.getName());
//            copyFile(srcFile, newFile);
            copyFile7(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
            int len;
            byte[] bytes = new byte[1024];

            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * JDK1.7异常处理
     * 改方法会自动释放流资源
     */
    private static void copyFile7(File srcFile, File newFile) {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));) {
            int len;
            byte[] bytes = new byte[1024];

            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * JDK9异常处理
     */
/*
    private static void copyFile9(File srcFile, File newFile) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
        try(bufferedInputStream;bufferedOutputStream) {
            int len;
            byte[] bytes = new byte[1024];

            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}
