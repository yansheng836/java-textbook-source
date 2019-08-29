package ch2.例子2;

public class MainClass {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.radius = 100;
		double area = circle.getArea();
		System.out.println("圆的面积:" + area);
		Lader lader = new Lader();
		lader.above = 10;
		lader.bottom = 56;
		lader.height = 8.9;
		area = lader.getArea();
		System.out.println("梯形的面积:" + area);
	}
}
