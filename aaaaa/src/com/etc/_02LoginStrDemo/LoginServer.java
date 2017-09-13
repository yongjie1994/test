package com.etc._02LoginStrDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *
 */
public class LoginServer {
	public static void main(String[] args) throws IOException {
		System.out.println("服务端准备好了.....");
//		1.	建立服务器端Socket绑定指定端口并开始监听
		ServerSocket server = new ServerSocket(8888);//大于1024 65535
//		2.	使用accept()方法阻塞等待监听，获得新的连接
		Socket client = server.accept();
		System.out.println("连接过来的客户端:"+client.getInetAddress());
//		3.	建立输入和输出流
		InputStream inputStream = client.getInputStream();
	    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//		4.	在已有的协议上产生会话
	    String mess = null;
	    while((mess=br.readLine())!=null){
	    	System.out.println("我是服务器,客户端的信息是:"+mess);
	    }
	    
	    
//		5.	使用close()关闭流和Socket
	    br.close();
	    inputStream.close();
	    client.close();
	    server.close();

	}

}
