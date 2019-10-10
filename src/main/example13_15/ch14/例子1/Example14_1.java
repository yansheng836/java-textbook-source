package ch14.例子1;

import java.net.URL;
import java.util.Scanner;

public class Example14_1 {
	public static void main(String args[]) {
		Scanner scanner;
		URL url;
		Thread readURL;
		Look look = new Look();
		System.out.println("输入URL资源,例如:http://www.yahoo.com");
		scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		try {
			url = new URL(source);
			look.setURL(url);
			readURL = new Thread(look);
		} catch (Exception exp) {
			System.out.println(exp);
		}
		readURL = new Thread(look);
		readURL.start();
	}
}
