package ch4.����5;

public class Example4_5 {
	public static void main(String args[]) {
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("�����û���haierTVĿǰ��Ƶ����" + haierTV.getChannel());
		Chineses zhangsan = new Chineses();
		zhangsan.buyTV(haierTV);
		System.out.println("zhangsan��ʼ�����ӽ�Ŀ");
		zhangsan.seeTV();
		int m = 2;
		System.out.println("zhangsan��ң��������صĵ��Ӹ��ĵ�" + m + "Ƶ��");
		zhangsan.remoteControl(m);
		System.out.println("���������û���haierTVĿǰ��Ƶ����" + haierTV.getChannel());
		System.out.println("zhangsan�ٿ����ӽ�Ŀ");
		zhangsan.seeTV();
	}
}
