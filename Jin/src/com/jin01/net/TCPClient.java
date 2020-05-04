package com.jin01.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description: TCP 客户端和服务器
 * @author: HuangJing
 * @date: 2020/02/12  13:22:40
 * @Version: 1.0
 **/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));

        socket.close();


    }
}
