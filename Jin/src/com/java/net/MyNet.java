package com.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName InetAddres的使用
 * @program: Jin_Java
 * @Description: 网络
 * @author: Jin
 * @Date: 2020/12/23 15:34
 * @version: V1.0
 */


/*
    InetAddress
        此类表示Internet协议（IP）地址

    public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
    public String getHostName()：获取此IP地址的主机名
    public String getHostAddress()：返回文本显示中的IP地址字符串
 */
public class MyNet {
    public static void main(String[] args) throws UnknownHostException {

//public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
//        InetAddress address = InetAddress.getByName("Jin");
        InetAddress address = InetAddress.getByName("192.168.2.93");

//        获取此IP地址的主机名
        String hostName = address.getHostName();
//        返回文本显示中的IP地址字符串
        String hostAddress = address.getHostAddress();

        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
