package com.test.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description: junit
 * @author: HuangJing
 * @date: 2020/02/15  23:16:40
 * @Version: 1.0
 **/
public class JunitDemo01 {
    @Before
    public void init(){
        System.out.println("程序开始");
    }
    @After
    public void close(){
        System.out.println("程序结束");
    }
    @Test
    public void show(){
        System.out.println("我爱你");
        int a = 2;
        int b = 4;
        int c= a-b;
        Assert.assertEquals(-2,c);
    }
}
