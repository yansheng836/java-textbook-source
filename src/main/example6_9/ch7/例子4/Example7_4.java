package ch7.例子4;

import java.util.Arrays;

public class Example7_4 {
	public static void main(String args[]) {
		int[] a = { 11, 22, 33, 44, 55 }, b, c, d;
		b = Arrays.copyOf(a, 8);
		System.out.println("数组 a 的各个元素中的值:");
		System.out.println(Arrays.toString(a));
		System.out.println("数组 b 的各个元素中的值:");
		System.out.println(Arrays.toString(b));
		c = Arrays.copyOfRange(a, 3, 5);
		System.out.println("数组 c 的各个元素中的值:");
		System.out.println(Arrays.toString(c));
		d = Arrays.copyOfRange(a, 1, 7);
		System.out.println("数组 d 的各个元素中的值:");
		System.out.println(Arrays.toString(d));
	}
}
