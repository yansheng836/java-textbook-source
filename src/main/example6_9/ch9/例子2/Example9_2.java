package ch9.例子2;

import java.util.Arrays;

public class Example9_2 {
	public static void main(String args[]) {
		String[] a = { "melon", "apple", "pear", "banana" };
		String[] b = Arrays.copyOf(a, a.length);
		System.out.println("使用用户编写的SortString类，按字典序排列数组a：");
		SortString.sort(a);
		System.out.println("排序结果是:");
		for (String s : b) {
			System.out.print("  " + s);
		}
		System.out.println("");
		System.out.println("使用类库中的Arrays类，按字典序排列数组b：");
		Arrays.sort(b);
		System.out.println("排序结果是:");
		for (String s : b) {
			System.out.print("  " + s);
		}

	}
}
