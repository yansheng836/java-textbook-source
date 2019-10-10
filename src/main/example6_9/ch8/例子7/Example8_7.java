package ch8.例子7;

public class Example8_7 {
	public static void main(String args[]) {
		int[] score = { -120, 98, 89, 120, 99 };
		int sum = 0;
		for (int number : score) {
			assert number > 0 : "负数不能是成绩";
			sum = sum + number;
		}
		System.out.println("总成绩:" + sum);
	}
}
