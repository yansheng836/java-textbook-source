package ch12.�ϻ�ʵ��ģ�����.ʵ��1;

import java.util.Arrays;

public class DelMaxAndMin extends DoThing {
	DoThing nextDoThing;

	public void setNext(DoThing next) {
		nextDoThing = next;
	}

	public void doThing(double[] a) {
		Arrays.sort(a);
		double[] b = Arrays.copyOfRange(a, 1, a.length);
		System.out.print("ȥ��һ����߷�:" + b[b.length - 1] + ",");
		System.out.println("ȥ��һ����ͷ�" + b[0]);
		nextDoThing.doThing(b);
	}
}
