package ch13.上机实践模板代码.实验2;

public class TwoThreadGuessNumber {
	public static void main(String args[]) {
		Number number = new Number();
		number.giveNumberThread.start();
		number.guessNumberThread.start();
	}
}
