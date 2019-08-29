package ch12.上机实践模板代码.实验1;

public class StreamLine {
	private DoThing one, two, three;

	StreamLine() {
		one = new DoInput();
		two = new DelMaxAndMin();
		three = new ComputerAver();
		one.setNext(two);
		two.setNext(three);
	}

	public void giveResult(double a[]) {
		one.doThing(a);
	}
}
