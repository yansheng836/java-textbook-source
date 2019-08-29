package ch13.例子5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Home implements Runnable {
	int time = 0;
	SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
	Date date;

	public void run() {
		while (true) {
			date = new Date();
			System.out.println(m.format(date));
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			if (time == 3) {
				Thread thread = Thread.currentThread();
				thread = new Thread(this);
				thread.start();
			}
		}
	}
}
