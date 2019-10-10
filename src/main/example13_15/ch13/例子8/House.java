package ch13.例子8;

public class House implements Runnable {
	int cake = 10;       // 用int变量模拟蛋糕的大小

	public void setCake(int c) {
		cake = c;
	}

	public void run() {
		while (true) {
			antDoing();
			if (cake <= 0) {
				System.out.println(Thread.currentThread().getName() + "进入死亡状态");
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
		System.out.println(Thread.currentThread().getName() + "想吃" + m + "克蛋糕.");
		cake = cake - m;
		if (cake >= 0)
			System.out.println(Thread.currentThread().getName() + "发现蛋糕还剩" + cake + "克");
		else {
			System.out.println(Thread.currentThread().getName() + "发现蛋糕没了");
		}
	}
}
