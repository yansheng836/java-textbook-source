package ch3.����1;

import java.util.Scanner;

public class Example3_1 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("��������������ÿ����һ����س�ȷ��");
		int x = reader.nextInt();
		int y = reader.nextInt();
		int z = reader.nextInt();
		Number number = new Number();
		number.sort(x, y, z);
	}
}
