package ch8.����7;

public class Example8_7 {
	public static void main(String args[]) {
		int[] score = { -120, 98, 89, 120, 99 };
		int sum = 0;
		for (int number : score) {
			assert number > 0 : "���������ǳɼ�";
			sum = sum + number;
		}
		System.out.println("�ܳɼ�:" + sum);
	}
}
