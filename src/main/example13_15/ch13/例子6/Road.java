package ch13.例子6;

public class Road implements Runnable {
	Thread attachThread;

	public void setAttachThread(Thread t) {
		attachThread = t;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("司机")) {
			try {
				System.out.println("我是" + name + "在马路上开车.");
				System.out.println("想睡上一个小时后再开车");
				Thread.sleep(1000 * 60 * 60);
			} catch (InterruptedException e) {
				System.out.println(name + "被警察叫醒了");
			}
			System.out.println(name + "继续开车");
		} else if (name.equals("警察")) {
			for (int i = 1; i <= 3; i++) {
				System.out.println(name + "喊：开车!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			attachThread.interrupt();   // 吵醒driver
		}
	}
}
