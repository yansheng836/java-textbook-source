package ch13.例子1;

public class Example13_1 {
	public static void main(String args[]) { // 主线程
		SpeakDog speakDog;
		SpeakCat speakCat;
		speakDog = new SpeakDog();      // 创建线程
		speakCat = new SpeakCat();      // 创建线程
		speakDog.start();               // 启动线程
		speakCat.start();             // 启动线程
		for (int i = 1; i <= 15; i++) {
			System.out.print("动物" + i + "  ");
		}
	}
}
