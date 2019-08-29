package ch13.例子2;

public class Ant extends Thread {
	Cake cake;

	Ant(String name, Cake c) {
		setName(name); // 调用从Thread类继承的setName方法为线程起名字
		cake = c;
	}

	public void run() {
		while (true) {
			int n = 2;
			System.out.print(getName() + "吃" + n + "克蛋糕.");
			cake.lost(n);  // 将蛋糕吃掉n克
			System.out.println(getName() + "发现蛋糕还剩" + cake.getSize() + "克");
			try {
				sleep(1000);  // 中断1000豪秒
			} catch (InterruptedException e) {
			}
			if (cake.getSize() <= 0) {
				System.out.println(getName() + "进入死亡状态");
				return;  // 结束run方法
			}
		}
	}
}
