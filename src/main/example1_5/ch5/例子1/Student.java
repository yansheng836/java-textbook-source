package ch5.����1;

public class Student extends People {
	int number;

	void tellNumber() {
		System.out.println("�ҵ�ѧ����:" + number);
	}

	int add(int x, int y) {
		return x + y;
	}

	int sub(int x, int y) {
		return x - y;
	}
}
