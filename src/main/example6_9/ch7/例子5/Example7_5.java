package ch7.����5;

import java.util.Arrays;
import java.util.Scanner;

public class Example7_5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] a = { 12, 34, 9, 23, 45, 6, 45, 90, 123, 19, 34 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("���������������жϸ������Ƿ���������:");
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			int index = Arrays.binarySearch(a, number);
			if (index >= 0) {
				System.out.println(number + "������������Ϊ" + index + "��Ԫ��ֵ��ͬ");
			} else {
				System.out.println(number + "�����������κ�Ԫ��ֵ��ͬ");
			}
			System.out.println("�Ƿ�������������������κη��������ɽ���");
		}
	}
}
