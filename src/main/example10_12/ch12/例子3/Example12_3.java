package ch12.����3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example12_3 {
	public static void main(String args[]) {
		List<String> list = new LinkedList<String>();
		list.add("��Һ�");
		list.add("����60����");
		list.add("ʮһ����");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String te = iter.next();
			System.out.print(te + " ");
		}
		System.out.println("");
		long endTime = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			String te = list.get(i);
			System.out.print(te + " ");
		}
	}
}
