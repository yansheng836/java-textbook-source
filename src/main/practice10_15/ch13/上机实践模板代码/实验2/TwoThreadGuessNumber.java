package ch13.�ϻ�ʵ��ģ�����.ʵ��2;

public class TwoThreadGuessNumber {
	public static void main(String args[]) {
		Number number = new Number();
		number.giveNumberThread.start();
		number.guessNumberThread.start();
	}
}
