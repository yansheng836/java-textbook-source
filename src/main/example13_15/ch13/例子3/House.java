package ch13.����3;

public class House implements Runnable {
	int cake;       // ��int����ģ�⵰��Ĵ�С

	public void setCake(int c) {
		cake = c;
	}

	public void run() {
		int m = 2;
		while (true) {
			if (cake <= 0) {
				System.out.println(Thread.currentThread().getName() + "��������״̬");
				return;
			}
			cake = cake - m;
			System.out.println(Thread.currentThread().getName() + "��" + m + "�˵���.");
			System.out.println(Thread.currentThread().getName() + "���ֵ��⻹ʣ" + cake + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
