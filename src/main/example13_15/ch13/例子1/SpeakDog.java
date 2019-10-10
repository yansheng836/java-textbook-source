package ch13.Àý×Ó1;

public class SpeakDog extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("Ð¡¹·" + i + "  ");
		}
	}
}
