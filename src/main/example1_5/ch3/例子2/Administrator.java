package ch3.����2;

public class Administrator {
	void giveMess(int number) {
		if (number / 10000 <= 0 || number / 10000 >= 10) {
			System.out.println("�����5λ���Ĳ�Ʊ����");
		} else {
			int d1 = number % 10;  // β��
			int d2 = number % 100; // ��2λ��
			int d3 = number % 1000;// ��3λ��
			switch (d1) {
			case 9:
			case 3:
			case 1:
				System.out.println("��Ʊ�����Ƚ�");
				break;
			default:
				System.out.println("��Ʊ�������Ƚ�");
			}
			switch (d2) {
			case 29:
			case 46:
			case 21:
				System.out.println("��Ʊ�Ƕ��Ƚ�");
				break;
			default:
				System.out.println("��Ʊ���Ƕ��Ƚ�");
			}
			switch (d3) {
			case 875:
			case 326:
			case 596:
				System.out.println("��Ʊ��һ�Ƚ�");
				break;
			default:
				System.out.println("��Ʊ����һ�Ƚ�");
			}
		}
	}
}
