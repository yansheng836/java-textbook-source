package ch12.����6;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Example12_6 {
	public static void main(String args[]) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		LinkedList<String> list2 = (LinkedList<String>) list1.clone();
		System.out.print("�����е�����:");
		Iterator<String> iter = list1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		Collections.shuffle(list1);   // ϴ��
		System.out.printf("\nϴ�ƺ������е�����:");
		iter = list1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.printf("\n�����е�����:");
		iter = list2.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		Collections.rotate(list2, 2);   // ������ת2��
		System.out.printf("\n������ת2���������е�����:");
		iter = list2.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
	}
}
