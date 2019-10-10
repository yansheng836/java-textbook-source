package ch13.Àı×Ó9;

public class Example13_9 {
	public static void main(String args[]) {
		TicketHouse officer = new TicketHouse();
		Thread zhangfei, likui;
		zhangfei = new Thread(officer);
		zhangfei.setName("ÕÅ·É");
		likui = new Thread(officer);
		likui.setName("ÀîåÓ");
		zhangfei.start();
		likui.start();
	}
}
