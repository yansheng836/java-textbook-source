package ch13.����8;

public class House implements Runnable {
	int cake = 10;       // ��int����ģ�⵰��Ĵ�С

	public void setCake(int c) {
		cake = c;
	}

	public void run() {
		while (true) {
			antDoing();
			if (cake <= 0) {
				System.out.println(Thread.currentThread().getName() + "��������״̬");
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	private synchronized void antDoing() {
		int m = 2;
		System.out.println(Thread.currentThread().getName() + "���" + m + "�˵���.");
		cake = cake - m;
		if (cake >= 0)
			System.out.println(Thread.currentThread().getName() + "���ֵ��⻹ʣ" + cake + "��");
		else {
			System.out.println(Thread.currentThread().getName() + "���ֵ���û��");
		}
	}
}
