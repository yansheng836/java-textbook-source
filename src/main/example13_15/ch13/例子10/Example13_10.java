package ch13.例子10;

public class Example13_10 {
	public static void main(String args[]) {
		ThreadJoin a = new ThreadJoin();
		Thread customer = new Thread(a);
		Thread cakeMaker = new Thread(a);
		customer.setName("顾客");
		cakeMaker.setName("蛋糕师");
		a.setJoinThread(cakeMaker);
		customer.start();
	}
}
