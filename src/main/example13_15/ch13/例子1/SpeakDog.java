package ch13.����1;

public class SpeakDog extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("С��" + i + "  ");
		}
	}
}
