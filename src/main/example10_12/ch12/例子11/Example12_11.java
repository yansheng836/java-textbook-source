package ch12.����11;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

class StudentKey implements Comparable<StudentKey> {
	double d = 0;

	StudentKey(double d) {
		this.d = d;
	}

	public int compareTo(StudentKey b) {
		if ((this.d - b.d) == 0)
			return -1;
		else
			return (int) ((this.d - b.d) * 1000);
	}
}

class Student {
	String name = null;
	double weight, height;

	Student(String s, double w, double h) {
		name = s;
		weight = w;
		height = h;
	}
}

public class Example12_11 {
	public static void main(String args[]) {
		final int NUMBER = 3;
		TreeMap<StudentKey, Student> treemap = new TreeMap<StudentKey, Student>();
		String[] str = { "��һ", "Ǯ��", "����" };
		double[] weight = { 78, 81, 69 };
		double[] height = { 182, 176, 179 };
		Student[] student = new Student[NUMBER];
		for (int k = 0; k < student.length; k++) {
			student[k] = new Student(str[k], weight[k], height[k]);
		}
		StudentKey[] key = new StudentKey[NUMBER];
		for (int k = 0; k < key.length; k++) {
			key[k] = new StudentKey(student[k].weight);
		}
		for (int k = 0; k < student.length; k++) {
			treemap.put(key[k], student[k]);   // ���������д�С
		}
		System.out.println("����������:");
		Collection<Student> collection = treemap.values();
		Iterator<Student> iter = collection.iterator();
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println("����:" + stu.name + ",����:" + stu.weight);
		}
		treemap.clear();
		for (int k = 0; k < key.length; k++) {
			key[k] = new StudentKey(student[k].height);
		}
		for (int k = 0; k < student.length; k++) {
			treemap.put(key[k], student[k]);     // ��������д�С
		}
		System.out.println("���������:");
		collection = treemap.values();
		iter = collection.iterator();
		while (iter.hasNext()) {
			Student stu = (Student) iter.next();
			System.out.println("����:" + stu.name + ",���:" + stu.height);
		}
	}
}
