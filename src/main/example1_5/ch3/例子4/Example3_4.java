package ch3.Р§зг4;

public class Example3_4 {
	public static void main(String args[]) {
		double sum = 0, item = 1;
		int i = 1, n = 20;
		while (i <= n) {
			sum = sum + item;
			i = i + 1;
			item = item * (1.0 / i);
		}
		System.out.println("sum=" + sum);
	}
}
