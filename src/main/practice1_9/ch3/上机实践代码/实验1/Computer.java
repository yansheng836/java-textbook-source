package ch3.�ϻ�ʵ������.ʵ��1;

import java.util.Scanner;

public class Computer {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		double amount = 0;  // ��ŵ���
		double price = 0;   // �û���Ҫ���ɵĵ��
		System.out.print("�������:");
		amount = reader.nextDouble();
		if (amount <= 90 && amount >= 1) {
			// ������1��//����price��ֵ
		} else if (amount <= 150 && amount >= 91) {
			// ������2��//����price��ֵ
		} else if (amount > 150) {
			// ������3��//����price��ֵ
		} else {
			System.out.println("�������:" + amount + "������");
		}
		System.out.printf("���:%5.2f", price);
	}
}
