package ch5.����12;

abstract class A {
	abstract int sum(int x, int y);

	int sub(int x, int y) {
		return x - y;
	}
}

class B extends A {
	int sum(int x, int y) {   // ���������д�����sum����
		return x + y;
	}
}

public class Example5_12 {
	public static void main(String args[]) {
		B b = new B();
		int sum = b.sum(30, 20);           // ������д�ķ���
		int sub = b.sub(30, 20);           // ���ü̳еķ���
		System.out.println("sum=" + sum);
		System.out.println("sum=" + sub);
	}
}
