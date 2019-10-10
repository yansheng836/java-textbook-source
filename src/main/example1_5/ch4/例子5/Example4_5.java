package ch4.例子5;

public class Example4_5 {
	public static void main(String args[]) {
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("卖给用户的haierTV目前的频道是" + haierTV.getChannel());
		Chineses zhangsan = new Chineses();
		zhangsan.buyTV(haierTV);
		System.out.println("zhangsan开始看电视节目");
		zhangsan.seeTV();
		int m = 2;
		System.out.println("zhangsan用遥控器将买回的电视更改到" + m + "频道");
		zhangsan.remoteControl(m);
		System.out.println("现在卖给用户的haierTV目前的频道是" + haierTV.getChannel());
		System.out.println("zhangsan再看电视节目");
		zhangsan.seeTV();
	}
}
