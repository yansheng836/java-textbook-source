package ch10.例子4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example10_4 {
	public static void main(String args[]) {
		int n = -1;
		byte[] a = new byte[100];
		try {
			File f = new File("Example10_4.java");
			FileInputStream in = new FileInputStream(f);
			while ((n = in.read(a, 0, 100)) != -1) {
				String s = new String(a, 0, n);
				System.out.print(s);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("File read Error" + e);
		}
	}
}
