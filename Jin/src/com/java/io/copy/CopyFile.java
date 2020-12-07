package com.java.io.copy;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName CopyFile
 * @program: Jin_Java
 * @Description: 复制单级文件夹
 * @author: Jin
 * @Date: 2020/12/4 17:45
 * @version: V1.0
 */
public class CopyFile {
    @Test
    public void test01() throws IOException {
        File fileFolder = new File("E:\\OneDrive\\04_回首频思忆\\WLOP");
        String src = fileFolder.getName();
        File JinFolder = new File("Jin" + src);
        if (!JinFolder.exists()) {
            JinFolder.mkdir();
        }
        File[] listFiles = fileFolder.listFiles();
        for (File listFile : listFiles) {
            String fileName = listFile.getName();
            File file = new File(JinFolder, fileName);
            copy(listFile,file);
        }

    }

    private void copy(File listFile, File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(listFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(bytes))!=-1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}

