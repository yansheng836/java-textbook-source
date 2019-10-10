package ch3.上机实践代码.实验1;

import java.util.Scanner;

public class Computer {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		double amount = 0;  // 存放电量
		double price = 0;   // 用户需要交纳的电费
		System.out.print("输入电量:");
		amount = reader.nextDouble();
		if (amount <= 90 && amount >= 1) {
			// 【代码1】//计算price的值
		} else if (amount <= 150 && amount >= 91) {
			// 【代码2】//计算price的值
		} else if (amount > 150) {
			// 【代码3】//计算price的值
		} else {
			System.out.println("输入电量:" + amount + "不合理");
		}
		System.out.printf("电费:%5.2f", price);
	}
}
