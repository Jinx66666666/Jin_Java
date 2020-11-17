package com.java.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @Description: 服务端
 * @author: HuangJing
 * @date: 2020/02/12  16:08:14
 * @Version: 1.0
 **/
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){//        让服务器一直处于死循环状态，（死循环accept()方法）
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("E:\\upload");
                        if (!file.exists()) {
                            file.mkdir();
                        }
//        优化，防止同名的图片被覆盖，自定义一个文件名的命名规则，规则为：域名 + 毫秒值 + 随机数
                        String fileName = "Jin" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1){
                            fos.write(bytes,0,len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                    }
                }
            }).start();
        }
//        serverSocket.close(); //服务器不用关闭
    }
}
