package ch8.����2;

public class Example8_2 {
	public static void main(String args[]) {
		ShowBoard board = new ShowBoard();
		board.showMess(new InputEnglish());  // ���������InputAlphabet���������
		board.showMess(new InputAlphabet()   // ���������InputAlphabet�������������
		{
			public void input() {
				for (char c = '��'; c <= '��'; c++)  // ���ϣ����ĸ
					System.out.printf("%3c", c);
			}
		});
	}
}
