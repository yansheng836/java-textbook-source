package ch13.例子9;

public class Example13_9 {
	public static void main(String args[]) {
		TicketHouse officer = new TicketHouse();
		Thread zhangfei, likui;
		zhangfei = new Thread(officer);
		zhangfei.setName("张飞");
		likui = new Thread(officer);
		likui.setName("李逵");
		zhangfei.start();
		likui.start();
	}
}
