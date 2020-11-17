package com.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: 服务器
 * @author: HuangJing
 * @date: 2020/02/12  13:44:39
 * @Version: 1.0
 **/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到收到".getBytes());
        accept.close();
        serverSocket.close();
    }
}
