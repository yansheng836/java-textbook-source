package ch4.例子11;

public class Example4_11 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.setRadius(196.87);
		Tixing lader = new Tixing(3, 21, 9);
		People zhang = new People();
		System.out.println("zhang计算圆的面积：");
		double result = zhang.computerArea(circle);
		System.out.println(result);
		System.out.println("zhang计算梯形的面积：");
		result = zhang.computerArea(lader);
		System.out.println(result);
	}
}
