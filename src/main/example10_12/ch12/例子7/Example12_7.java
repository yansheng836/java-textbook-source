package ch12.����7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Example12_7 {
	public static void main(String args[]) {
		int m = 5;
		LinkedList<String> list = new LinkedList<String>();
		System.out.printf("����ΧȦ������(��%d��)\n", m);
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= m; i++) {
			String name = scanner.nextLine();
			list.add(name);
		}
		System.out.printf("\n��ǰȦ�е���:");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.printf("\n˳ʱ��������3���ˣ����˴�Ȧ���˳�:");
		while (list.size() > 1) {
			Collections.rotate(list, -2);   // ������ת2��
			String removedPeople = list.removeFirst();
			System.out.printf("\n" + removedPeople + "��Ȧ���˳�.");
			System.out.print(" ��ǰȦ�е���:");
			iter = list.iterator();
			while (iter.hasNext()) {
				String str = iter.next();
				System.out.print(str + " ");
			}
		}
		System.out.printf("\nȦ�����ʣ�µ���:%s", list.get(0));
	}
}
