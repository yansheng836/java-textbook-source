package ch4.����11;

public class Example4_11 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.setRadius(196.87);
		Tixing lader = new Tixing(3, 21, 9);
		People zhang = new People();
		System.out.println("zhang����Բ�������");
		double result = zhang.computerArea(circle);
		System.out.println(result);
		System.out.println("zhang�������ε������");
		result = zhang.computerArea(lader);
		System.out.println(result);
	}
}
