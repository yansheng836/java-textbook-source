package ch7.����4;

import java.util.Arrays;

public class Example7_4 {
	public static void main(String args[]) {
		int[] a = { 11, 22, 33, 44, 55 }, b, c, d;
		b = Arrays.copyOf(a, 8);
		System.out.println("���� a �ĸ���Ԫ���е�ֵ:");
		System.out.println(Arrays.toString(a));
		System.out.println("���� b �ĸ���Ԫ���е�ֵ:");
		System.out.println(Arrays.toString(b));
		c = Arrays.copyOfRange(a, 3, 5);
		System.out.println("���� c �ĸ���Ԫ���е�ֵ:");
		System.out.println(Arrays.toString(c));
		d = Arrays.copyOfRange(a, 1, 7);
		System.out.println("���� d �ĸ���Ԫ���е�ֵ:");
		System.out.println(Arrays.toString(d));
	}
}
