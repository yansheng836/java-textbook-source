package ch3.����1;

public class Number {
	void sort(int a, int b, int c) {
		int count = 0;
		int temp = 0;
		if (b < a) {
			temp = a;
			a = b;
			b = temp;
			count++;
			System.out.println("����ĵ�" + count + "�β������:" + a + "," + b + "," + c);
		}
		if (c < a) {
			temp = a;
			a = c;
			c = temp;
			count++;
			System.out.println("����ĵ�" + count + "�β������:" + a + "," + b + "," + c);
		}
		if (c < b) {
			temp = b;
			b = c;
			c = temp;
			count++;
			System.out.println("����ĵ�" + count + "�β������:" + a + "," + b + "," + c);
		}
		if (count == 0) {
			System.out.println("����ĵ�" + count + "�β������:" + a + "," + b + "," + c);
		}
	}
}
