package ch3.例子2;

import java.util.Scanner;

public class Example3_2 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入彩票号回车确认");
		int number = reader.nextInt();
		Administrator person = new Administrator();
		person.giveMess(number);
	}
}
