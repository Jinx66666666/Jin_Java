package com.java.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: 浏览器和服务器结构
 * @author: HuangJing
 * @date: 2020/02/13  09:55:24
 * @Version: 1.0
 **/
public class BSServer {
    public static void main(String[] args) throws IOException {
//        demo01();
        demo02();
    }

    private static void demo02() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        Socket socket = serverSocket.accept();
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);
                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();
//        写入http响应开头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
//        必须写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                    }
                }
            }).start();
        }
//        serverSocket.close();
    }

    private static void demo01() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
//        然后在浏览器访问http://127.0.0.1:8080/jin01/web/html
    }
}
