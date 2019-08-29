package ch4.例子4;

public class Example4_4 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		double w = 12.76;
		circle.setRadius(w);
		System.out.println("圆的半径：" + circle.getRadius());
		System.out.println("圆的面积：" + circle.getArea());
		System.out.println("更改向方法参数r传递值的w的值为100");
		w = 100;
		System.out.println("w=" + w);
		System.out.println("圆的半径：" + circle.getRadius());
	}
}
