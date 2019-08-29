package ch4.例子6;

public class Computer {
	public int getSum(int... x) {  // x是可变参数的参数代表
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
}
