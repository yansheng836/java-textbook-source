package ch4.�ϻ�ʵ������.ʵ��3;

public class MainClass {
	public static void main(String args[]) {
		Village zhaoZhuang, maJiaHeZhi;
		zhaoZhuang = new Village("��ׯ");
		maJiaHeZhi = new Village("��Һ���");
		zhaoZhuang.peopleNumber = 100;
		maJiaHeZhi.peopleNumber = 150;
		// ������1�� //������Village����treeAmount,����ֵ200
		int leftTree = Village.treeAmount;
		System.out.println("ɭ������ " + leftTree + " ����");
		// ������2��//zhaoZhuang����treePlanting(int n),���������ֵ50
		// leftTree =������3��//maJiaHeZhi����lookTreeAmount()�����õ���ľ������
		System.out.println("ɭ������ " + leftTree + " ����");
		// ������4��maJiaHeZhi����fellTree(int n),���������ֵ70
		leftTree = Village.lookTreeAmount();
		System.out.println("ɭ������ " + leftTree + " ����");
		System.out.println("��ׯ���˿�:" + zhaoZhuang.peopleNumber);
		zhaoZhuang.addPeopleNumber(12);
		System.out.println("��ׯ���˿�:" + zhaoZhuang.peopleNumber);
		System.out.println("��Һ��ӵ��˿�:" + maJiaHeZhi.peopleNumber);
		maJiaHeZhi.addPeopleNumber(10);
		System.out.println("��Һ��ӵ��˿�:" + maJiaHeZhi.peopleNumber);
	}
}
