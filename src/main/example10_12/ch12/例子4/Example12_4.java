package ch12.例子4;

import java.util.Iterator;
import java.util.LinkedList;

public class Example12_4 {
	public static void main(String args[]) {
		LinkedList mylist = new LinkedList();
		mylist.add("Hello");                 // 链表中的第一个节点
		mylist.add("nice meet you");          // 链表中的第二个节点
		int number = mylist.size();            // 获取链表的长度
		for (int i = 0; i < number; i++) {
			String temp = (String) mylist.get(i);   // 必须强制转换取出的数据
			System.out.println("第" + i + "节点中的数据:" + temp);
		}
		Iterator iter = mylist.iterator();
		while (iter.hasNext()) {
			String te = (String) iter.next();  // 必须强制转换取出的数据
			System.out.println(te);
		}
	}
}
