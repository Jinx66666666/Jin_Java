package com.java.InterfaceDemo;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2019/12/16  22:02:51
 * @Version: 1.0
 **/
public interface MyInterface {

    public abstract void methodAbstract();

    public default void  methodDefault(){
        System.out.println("默认方法");
    }

    public static  void methodStatic(){
        System.out.println("静态方法");
    }
}
