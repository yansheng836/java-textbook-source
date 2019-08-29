package ch5.例子1;

public class Example5_1 {
	public static void main(String args[]) {
		int x = 12, y = 18;
		Student zhang = new Student();
		zhang.weight = 73.8;
		zhang.height = 177;
		zhang.number = 100101;
		zhang.tellHeightAndWeight();
		zhang.tellNumber();
		System.out.print("zhang会做加减：");
		int result = zhang.add(x, y);
		System.out.printf("%d+%d=%d\t", x, y, result);
		result = zhang.sub(x, y);
		System.out.printf("%d-%d=%d\n", x, y, result);
		UniverStudent geng = new UniverStudent();
		geng.number = 6609;
		geng.tellHeightAndWeight();
		geng.tellNumber();
		System.out.print("geng会做加减乘除：");
		result = geng.add(x, y);
		System.out.printf("%d+%d=%d\t", x, y, result);
		result = geng.sub(x, y);
		System.out.printf("%d-%d=%d\t", x, y, result);
		result = geng.multi(x, y);
		System.out.printf("%d×%d=%d\t", x, y, result);
		double re = geng.div(x, y);
		System.out.printf("%d÷%d=%f\n", x, y, re);
	}
}
