?package ch13.Р§зг1;

public class SpeakCat extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("аЁУЈ" + i + "  ");
		}
	}
}
