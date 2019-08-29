package ch5.例子12;

abstract class A {
	abstract int sum(int x, int y);

	int sub(int x, int y) {
		return x - y;
	}
}

class B extends A {
	int sum(int x, int y) {   // 子类必须重写父类的sum方法
		return x + y;
	}
}

public class Example5_12 {
	public static void main(String args[]) {
		B b = new B();
		int sum = b.sum(30, 20);           // 调用重写的方法
		int sub = b.sub(30, 20);           // 调用继承的方法
		System.out.println("sum=" + sum);
		System.out.println("sum=" + sub);
	}
}
