package ch6.����2;

interface �շ� {
	public void ��ȡ����();
}

interface �����¶� {
	public void controlTemperature();
}

class �������� implements �շ� {
	public void ��ȡ����() {
		System.out.println("��������:һԪ/��,�����㹫����");
	}
}

class ���⳵ implements �շ�, �����¶� {
	public void ��ȡ����() {
		System.out.println("���⳵:3.20Ԫ/����,���3����");
	}

	public void controlTemperature() {
		System.out.println("��װ��Hair�յ�");
	}
}

class ��ӰԺ implements �շ�, �����¶� {
	public void ��ȡ����() {
		System.out.println("��ӰԺ:��Ʊ,ʮԪ/��");
	}

	public void controlTemperature() {
		System.out.println("��װ������յ�");
	}
}

public class Example6_2 {
	public static void main(String args[]) {
		�������� ��· = new ��������();
		���⳵ ���� = new ���⳵();
		��ӰԺ ���� = new ��ӰԺ();
		��·.��ȡ����();
		����.��ȡ����();
		����.��ȡ����();
		����.controlTemperature();
		����.controlTemperature();
	}
}
