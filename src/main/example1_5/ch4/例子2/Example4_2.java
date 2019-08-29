package ch4.例子2;

public class Example4_2 {
	public static void main(String args[]) {
		Vehicle car1, car2;       // 声明2个对象
		car1 = new Vehicle(); // 为对象car1分配变量，使用new 运算符和默认的构造方法
		car2 = new Vehicle(); // 为对象car2分配变量，使用new 运算符和默认的构造方法
		car1.setPower(128);
		car2.setPower(76);
		System.out.println("car1的功率是：" + car1.getPower());
		System.out.println("car2的功率是：" + car2.getPower());
		car1.speedUp(80);
		car2.speedUp(100);
		System.out.println("car1目前的速度：" + car1.getSpeed());
		System.out.println("car2目前的速度：" + car2.getSpeed());
		car1.speedDown(10);
		car2.speedDown(20);
		System.out.println("car1目前的速度：" + car1.getSpeed());
		System.out.println("car2目前的速度：" + car2.getSpeed());
	}
}
