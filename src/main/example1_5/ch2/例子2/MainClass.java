package ch2.����2;

public class MainClass {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.radius = 100;
		double area = circle.getArea();
		System.out.println("Բ�����:" + area);
		Lader lader = new Lader();
		lader.above = 10;
		lader.bottom = 56;
		lader.height = 8.9;
		area = lader.getArea();
		System.out.println("���ε����:" + area);
	}
}
