package ch2.����6;

import java.util.Scanner;

public class Example2_6 {
	public static void main(String args[]) {
		Rect rectangle = new Rect();
		Scanner reader = new Scanner(System.in);
		System.out.println("������εĿ����س�ȷ��");
		rectangle.width = reader.nextDouble();
		System.out.println("������εĸߣ����س�ȷ��");
		rectangle.height = reader.nextDouble();
		double area = rectangle.getArea();
		System.out.println("rectangle�����:" + area);
	}
}
