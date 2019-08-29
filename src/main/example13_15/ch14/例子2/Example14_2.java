package ch14.例子2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example14_2 {
	public static void main(String args[]) {
		try {
			InetAddress address_1 = InetAddress.getByName("www.sina.com.cn");
			System.out.println(address_1.toString());
			InetAddress address_2 = InetAddress.getByName("166.111.222.3");
			System.out.println(address_2.toString());
		} catch (UnknownHostException e) {
			System.out.println("无法找到 www.sina.com.cn");
		}
	}
}
