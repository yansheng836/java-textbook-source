package ch10.例子6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example10_6 {
	public static void main(String args[]) {
		String content = "broadsword 勇者无敌";
		try {
			File f = new File("hello.txt");
			char[] a = content.toCharArray();
			FileWriter out = new FileWriter(f);
			out.write(a, 0, a.length);
			out.close();
			FileReader in = new FileReader(f);
			StringBuffer s = new StringBuffer();
			char tom[] = new char[10];
			int n = -1;
			while ((n = in.read(tom, 0, 10)) != -1) {
				String temp = new String(tom, 0, n);
				s.append(temp);
			}
			in.close();
			System.out.println(new String(s));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
