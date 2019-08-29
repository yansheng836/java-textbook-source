package ch5.例子1;

public class Student extends People {
	int number;

	void tellNumber() {
		System.out.println("我的学号是:" + number);
	}

	int add(int x, int y) {
		return x + y;
	}

	int sub(int x, int y) {
		return x - y;
	}
}
