package ch3.例子5;

public class Example3_5 {
	public static void main(String args[]) {
		for (char c = 'a'; c <= 'z'; c++) {
			switch (c) {
			case 'a':
			case 'z':
			case 'm':
				continue;
			}
			System.out.print(c);
		}
		System.out.println("");
		long sum = 0, i = 1, max = 1931918, N = 0;
		while (true) {
			sum = sum + i;
			if (sum > max) {
				N = i - 1;
				break;
			}
			i++;
		}
		System.out.println("输出满足1+2+...+n<=" + max + "的最大整数n为" + N);
	}
}
