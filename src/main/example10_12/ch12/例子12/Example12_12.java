package ch12.����12;

import java.util.ArrayList;

public class Example12_12 {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);  // �Զ�װ��,ʵ����ӵ�list�е���new Integer(i)��
		}
		for (int k = list.size() - 1; k >= 0; k--) {
			int m = list.get(k);  // �Զ�����,��ȡInteger�����е�int������
			System.out.printf("%3d", m);
		}
	}
}
