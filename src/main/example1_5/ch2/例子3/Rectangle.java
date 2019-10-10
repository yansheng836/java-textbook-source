package ch2.例子3;

public class Rectangle {
	double width;
	double height;

	double getArea() {
		return width * height;
	}
}

class Example2_3        // 主类
{
	public static void main(String args[]) {
		Rectangle r;
		r = new Rectangle();
		r.width = 1.819;
		r.height = 1.5;
		double area = r.getArea();
		System.out.println("矩形的面积:" + area);
	}
}
