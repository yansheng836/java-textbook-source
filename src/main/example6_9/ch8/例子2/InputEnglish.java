package ch8.例子2;

public class InputEnglish extends InputAlphabet {
	public void input() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.printf("%3c", c);
		}
	}
}
