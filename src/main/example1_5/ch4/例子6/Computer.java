package ch4.����6;

public class Computer {
	public int getSum(int... x) {  // x�ǿɱ�����Ĳ�������
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
}
