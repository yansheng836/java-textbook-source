package ch12.例子5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example12_5 {
	public static void main(String args[]) {
		LinkedList<String> listString = new LinkedList<String>();
		listString.add("bird");
		listString.add("apple");
		listString.add("cat");
		Collections.sort(listString);
		Iterator<String> iterString = listString.iterator();
		while (iterString.hasNext()) {
			String s = iterString.next();
			System.out.print(s + " ");
		}
		int index = Collections.binarySearch(listString, "apple");
		if (index >= 0)
			System.out.println("链表中含有和对象apple相等的数据");
		List<People> listPeople = new LinkedList<People>();
		listPeople.add(new People(176, 72));
		listPeople.add(new People(170, 68));
		listPeople.add(new People(165, 60));
		listPeople.add(new People(178, 77));
		Collections.sort(listPeople);
		Iterator<People> iterPeople = listPeople.iterator();
		while (iterPeople.hasNext()) {
			People p = iterPeople.next();
			System.out.println("身高:" + p.height + "cm 体重:" + p.weight);
		}
		People zhang = new People(170, 80);
		index = Collections.binarySearch(listPeople, zhang);
		if (index >= 0)
			System.out.println("链表中含有和对象zhang相等的数据");
	}
}
