package ch12.����4;

import java.util.Iterator;
import java.util.LinkedList;

public class Example12_4 {
	public static void main(String args[]) {
		LinkedList mylist = new LinkedList();
		mylist.add("Hello");                 // �����еĵ�һ���ڵ�
		mylist.add("nice meet you");          // �����еĵڶ����ڵ�
		int number = mylist.size();            // ��ȡ����ĳ���
		for (int i = 0; i < number; i++) {
			String temp = (String) mylist.get(i);   // ����ǿ��ת��ȡ��������
			System.out.println("��" + i + "�ڵ��е�����:" + temp);
		}
		Iterator iter = mylist.iterator();
		while (iter.hasNext()) {
			String te = (String) iter.next();  // ����ǿ��ת��ȡ��������
			System.out.println(te);
		}
	}
}
