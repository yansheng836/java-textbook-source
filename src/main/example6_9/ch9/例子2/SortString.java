package ch9.例子2;

import java.util.Arrays;

public class SortString {
	public static void sort(String a[]) {
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[i]) < 0) {
					count++;
					System.out.printf("交换%s和%s:", a[i], a[j]);
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					System.out.println("第" + count + "次排序结果:");
					System.out.println(Arrays.toString(a));
				}
			}
		}
	}
}
