package com.java.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description: 文件上传客户端】
 * @author: HuangJing
 * @date: 2020/02/12  15:45:34
 * @Version: 1.0
 **/
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\12159\\Pictures\\壁纸\\手机壁纸\\wallhaven-j5qdpp.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
//        解决：上传完文件，给服务器写个标记
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        while ((len = is.read(bytes1)) != -1){
            System.out.println(new String(bytes1,0,len));
        }
        fis.close();
        socket.close();
    }
}
