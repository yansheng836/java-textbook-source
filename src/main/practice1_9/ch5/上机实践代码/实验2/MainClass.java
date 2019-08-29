package ch5.上机实践代码.实验2;

public class MainClass {
	public static void main(String args[]) {
		Student zhang = new Student();
		double area = zhang.area(new Rect(2, 3), new Circle(5.2), new Circle(12));
		System.out.printf("2个圆和1个矩形图形的面积和：\n%10.3f", area);
	}
}
