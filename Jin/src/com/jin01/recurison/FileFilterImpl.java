package com.jin01.recurison;

import java.io.File;
import java.io.FileFilter;

/**
 * @Description: 过滤器
 * @author: HuangJing
 * @date: 2020/01/15  16:48:08
 * @Version: 1.0
 **/
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
