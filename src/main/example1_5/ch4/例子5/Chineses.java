package ch4.����5;

public class Chineses {
	TV homeTV;

	void buyTV(TV tv) {
		homeTV = tv;
	}

	void remoteControl(int m) {
		homeTV.setChannel(m);
	}

	void seeTV() {
		homeTV.showProgram();
		System.out.println("�û���صĵ�������" + homeTV.getChannel() + "Ƶ��");
	}
}
