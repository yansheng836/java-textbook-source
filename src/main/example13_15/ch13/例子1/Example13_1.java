package ch13.����1;

public class Example13_1 {
	public static void main(String args[]) { // ���߳�
		SpeakDog speakDog;
		SpeakCat speakCat;
		speakDog = new SpeakDog();      // �����߳�
		speakCat = new SpeakCat();      // �����߳�
		speakDog.start();               // �����߳�
		speakCat.start();             // �����߳�
		for (int i = 1; i <= 15; i++) {
			System.out.print("����" + i + "  ");
		}
	}
}
