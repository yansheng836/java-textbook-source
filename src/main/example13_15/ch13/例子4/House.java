package ch13.����4;

public class House implements Runnable {
	int cake = 10;       // ��int����ģ�⵰��Ĵ�С
	Thread attachThread;

	public void setCake(int c) {
		cake = c;
	}

	public void setAttachThread(Thread t) {
		attachThread = t;
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
			if (cake <= 4) {
				try {
					attachThread.start(); // ���������ϣ������ϵȴ�CPU
				} catch (Exception exp) {
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
