package ch13.例子3;

public class House implements Runnable {
	int cake;       // 用int变量模拟蛋糕的大小

	public void setCake(int c) {
		cake = c;
	}

	public void run() {
		int m = 2;
		while (true) {
			if (cake <= 0) {
				System.out.println(Thread.currentThread().getName() + "进入死亡状态");
				return;
			}
			cake = cake - m;
			System.out.println(Thread.currentThread().getName() + "吃" + m + "克蛋糕.");
			System.out.println(Thread.currentThread().getName() + "发现蛋糕还剩" + cake + "克");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
