package ch12.例子6;

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
		System.out.print("链表中的数据:");
		Iterator<String> iter = list1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		Collections.shuffle(list1);   // 洗牌
		System.out.printf("\n洗牌后链表中的数据:");
		iter = list1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.printf("\n链表中的数据:");
		iter = list2.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		Collections.rotate(list2, 2);   // 向右旋转2步
		System.out.printf("\n向右旋转2步后链表中的数据:");
		iter = list2.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
	}
}
