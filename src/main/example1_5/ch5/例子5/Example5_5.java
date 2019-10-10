package ch5.例子5;

class A {
	float computer(float x, float y) {
		return x + y;
	}

	public int g(int x, int y) {
		return x + y;
	}
}

class B extends A {
	float computer(float x, float y) {
		return x * y;
	}
}

public class Example5_5 {
	public static void main(String args[]) {
		B b = new B();
		double result = b.computer(8, 9);        // b调用重写的方法
		System.out.println("调用重写方法得到的结果:" + result);
		int m = b.g(12, 8);        // b调用继承的方法
		System.out.println("调用继承方法得到的结果:" + m);
	}
}
