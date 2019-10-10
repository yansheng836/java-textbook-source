package ch10.例子5;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example10_5 {
	public static void main(String args[]) {
		byte[] a = "国庆60周年".getBytes();
		byte[] b = "十一快乐".getBytes();
		try {
			FileOutputStream out = new FileOutputStream("happy.txt");
			out.write(a);
			out.write(b, 0, b.length);
			out.close();
		} catch (IOException e) {
			System.out.println("Error " + e);
		}
	}
}
