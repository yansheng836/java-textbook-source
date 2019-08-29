package ch2.例子6;

import java.util.Scanner;

public class Example2_6 {
	public static void main(String args[]) {
		Rect rectangle = new Rect();
		Scanner reader = new Scanner(System.in);
		System.out.println("输入矩形的宽，并回车确认");
		rectangle.width = reader.nextDouble();
		System.out.println("输入矩形的高，并回车确认");
		rectangle.height = reader.nextDouble();
		double area = rectangle.getArea();
		System.out.println("rectangle的面积:" + area);
	}
}
