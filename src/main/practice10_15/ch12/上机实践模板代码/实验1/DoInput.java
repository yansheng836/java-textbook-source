package ch12.�ϻ�ʵ��ģ�����.ʵ��1;

import java.util.Scanner;

public class DoInput extends DoThing {
	DoThing nextDoThing;

	public void setNext(DoThing next) {
		nextDoThing = next;
	}

	public void doThing(double[] a) {
		System.out.println("�����������");
		Scanner read = new Scanner(System.in);
		int count = read.nextInt();
		System.out.println("������������еķ���");
		a = new double[count];
		for (int i = 0; i < count; i++) {
			a[i] = read.nextDouble();
		}
		nextDoThing.doThing(a);
	}
}
