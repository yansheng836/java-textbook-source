package ch13.����6;

public class Road implements Runnable {
	Thread attachThread;

	public void setAttachThread(Thread t) {
		attachThread = t;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("˾��")) {
			try {
				System.out.println("����" + name + "����·�Ͽ���.");
				System.out.println("��˯��һ��Сʱ���ٿ���");
				Thread.sleep(1000 * 60 * 60);
			} catch (InterruptedException e) {
				System.out.println(name + "�����������");
			}
			System.out.println(name + "��������");
		} else if (name.equals("����")) {
			for (int i = 1; i <= 3; i++) {
				System.out.println(name + "��������!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			attachThread.interrupt();   // ����driver
		}
	}
}
