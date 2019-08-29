package ch4.例子5;

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
		System.out.println("用户买回的电视是在" + homeTV.getChannel() + "频道");
	}
}
