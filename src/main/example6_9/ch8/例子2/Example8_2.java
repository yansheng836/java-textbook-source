package ch8.例子2;

public class Example8_2 {
	public static void main(String args[]) {
		ShowBoard board = new ShowBoard();
		board.showMess(new InputEnglish());  // 向参数传递InputAlphabet的子类对象
		board.showMess(new InputAlphabet()   // 向参数传递InputAlphabet的匿名子类对象
		{
			public void input() {
				for (char c = 'α'; c <= 'ω'; c++)  // 输出希腊字母
					System.out.printf("%3c", c);
			}
		});
	}
}
