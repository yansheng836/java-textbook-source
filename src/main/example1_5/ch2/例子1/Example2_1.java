package ch2.例子1;

public class Example2_1 {
	public static void main(String args[]) {
		Rect rectangle1, rectangle2; // 声明2个对象
		rectangle1 = new Rect();    // 创建对象
		rectangle2 = new Rect();
		rectangle1.width = 128;
		rectangle1.height = 69;
		rectangle2.width = 18.9;
		rectangle2.height = 59.8;
		double area = rectangle1.getArea();
		System.out.println("rectangle1的面积:" + area);
		area = rectangle2.getArea();
		System.out.println("rectangle2的面积:" + area);
	}
}
