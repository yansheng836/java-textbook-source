package ch13.����2;

public class Ant extends Thread {
	Cake cake;

	Ant(String name, Cake c) {
		setName(name); // ���ô�Thread��̳е�setName����Ϊ�߳�������
		cake = c;
	}

	public void run() {
		while (true) {
			int n = 2;
			System.out.print(getName() + "��" + n + "�˵���.");
			cake.lost(n);  // ������Ե�n��
			System.out.println(getName() + "���ֵ��⻹ʣ" + cake.getSize() + "��");
			try {
				sleep(1000);  // �ж�1000����
			} catch (InterruptedException e) {
			}
			if (cake.getSize() <= 0) {
				System.out.println(getName() + "��������״̬");
				return;  // ����run����
			}
		}
	}
}
