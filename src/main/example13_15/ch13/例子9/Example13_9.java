package ch13.����9;

public class Example13_9 {
	public static void main(String args[]) {
		TicketHouse officer = new TicketHouse();
		Thread zhangfei, likui;
		zhangfei = new Thread(officer);
		zhangfei.setName("�ŷ�");
		likui = new Thread(officer);
		likui.setName("����");
		zhangfei.start();
		likui.start();
	}
}
