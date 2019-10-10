package ch14.例子3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String args[]) {
		String[] mess = { "1+1在什么情况下不等于2", "狗为什不生跳蚤", "什么东西能看、能吃、能坐" };
		Socket mysocket;
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			mysocket = new Socket("127.0.0.1", 2010);
			in = new DataInputStream(mysocket.getInputStream());
			out = new DataOutputStream(mysocket.getOutputStream());
			for (int i = 0; i < mess.length; i++) {
				out.writeUTF(mess[i]);
				String s = in.readUTF();   // in读取信息，堵塞状态
				System.out.println("客户收到服务器的回答:" + s);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("服务器已断开" + e);
		}
	}
}
