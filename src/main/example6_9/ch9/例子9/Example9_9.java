package ch9.例子9;

import java.util.Scanner;

public class Example9_9 {
	public static void main(String args[]) {
		String regex = "[a-zZ-Z]+";
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if (str.matches(regex)) {
			System.out.println(str + "中的字符都是英文字母");
		}
	}
}
