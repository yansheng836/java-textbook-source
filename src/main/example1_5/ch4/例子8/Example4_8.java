package ch4.例子8;

public class Example4_8 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.setRadius(29);
		Circular circular = new Circular();
		circular.setBottom(circle);
		circular.setHeight(128.76);
		System.out.println("圆锥底圆的半径:" + circular.getBottomRadius());
		System.out.printf("圆锥的体积(保留3位小数):%5.3f\n", circular.getVolme());
		circular.setBottomRadius(208);
		System.out.println("圆锥底圆的半径:" + circular.getBottomRadius());
		System.out.printf("圆锥的体积(保留3位小数):%5.3f\n", circular.getVolme());
	}
}
