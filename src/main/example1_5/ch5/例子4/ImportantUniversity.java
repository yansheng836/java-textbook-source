package ch5.����4;

public class ImportantUniversity extends University {
	void enterRule(double math, double english, double chinese) {
		double total = math + english + chinese;
		if (total >= 245)
			System.out.println("����" + total + "�ﵽ�ص��ѧ���¼ȡ��");
		else
			System.out.println("����" + total + "δ�ﵽ�ص��ѧ���¼ȡ��");
	}
}
