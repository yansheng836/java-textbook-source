package ch3.例子1;

import java.util.Scanner;

public class Example3_1 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入三个整数，每输入一个需回车确认");
		int x = reader.nextInt();
		int y = reader.nextInt();
		int z = reader.nextInt();
		Number number = new Number();
		number.sort(x, y, z);
	}
}
