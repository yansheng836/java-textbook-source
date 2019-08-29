package ch9.例子22;

import java.util.Scanner;

public class ComputerSum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("输入一个整数");
		while (scanner.hasNextInt()) {
			int item = scanner.nextInt();
			sum = sum + item;
			System.out.println("目前和" + sum);
			if (sum >= 8000)
				System.exit(0);
			System.out.println("输入一个整数(输入非整数结束输入)");
		}
		System.out.println("总和" + sum);
	}
}
