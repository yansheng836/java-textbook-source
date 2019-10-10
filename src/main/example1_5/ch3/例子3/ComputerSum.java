package ch3.例子3;

public class ComputerSum {
	void giveSum(int number, int length) {
		if (number <= 9 && number >= 1) {
			long sum = 0, a = number, item = a, n = length, i = 1;
			for (i = 1; i <= n; i++) {
				sum = sum + item;
				item = item * 10 + a;
			}
			System.out.println(sum);
		} else {
			System.out.println("请给出正确的数字");
		}
	}
}
