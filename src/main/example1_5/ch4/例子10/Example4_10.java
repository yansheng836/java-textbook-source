package ch4.例子10;

class Sum {
	int x, y, z;

	static int getContinueSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

public class Example4_10 {
	public static void main(String args[]) {
		int result = Sum.getContinueSum(0, 100);
		System.out.println(result);
	}
}
