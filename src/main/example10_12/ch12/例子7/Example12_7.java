package ch12.例子7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Example12_7 {
	public static void main(String args[]) {
		int m = 5;
		LinkedList<String> list = new LinkedList<String>();
		System.out.printf("输入围圈的人名(共%d人)\n", m);
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= m; i++) {
			String name = scanner.nextLine();
			list.add(name);
		}
		System.out.printf("\n当前圈中的人:");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.printf("\n顺时针数到第3个人，该人从圈中退出:");
		while (list.size() > 1) {
			Collections.rotate(list, -2);   // 向左旋转2步
			String removedPeople = list.removeFirst();
			System.out.printf("\n" + removedPeople + "从圈中退出.");
			System.out.print(" 当前圈中的人:");
			iter = list.iterator();
			while (iter.hasNext()) {
				String str = iter.next();
				System.out.print(str + " ");
			}
		}
		System.out.printf("\n圈中最后剩下的是:%s", list.get(0));
	}
}
