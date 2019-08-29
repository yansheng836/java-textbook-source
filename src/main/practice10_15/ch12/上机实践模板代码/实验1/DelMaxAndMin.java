package ch12.上机实践模板代码.实验1;

import java.util.Arrays;

public class DelMaxAndMin extends DoThing {
	DoThing nextDoThing;

	public void setNext(DoThing next) {
		nextDoThing = next;
	}

	public void doThing(double[] a) {
		Arrays.sort(a);
		double[] b = Arrays.copyOfRange(a, 1, a.length);
		System.out.print("去掉一个最高分:" + b[b.length - 1] + ",");
		System.out.println("去掉一个最低分" + b[0]);
		nextDoThing.doThing(b);
	}
}
