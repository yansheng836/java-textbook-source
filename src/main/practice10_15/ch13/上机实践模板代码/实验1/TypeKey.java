package ch13.上机实践模板代码.实验1;

public class TypeKey {
	public static void main(String args[]) {
		System.out.println("键盘练习(输入#结束程序)");
		System.out.printf("输入显示的字母(回车)\n");
		Letter letter;
		letter = new Letter();
		GiveLetterThread giveChar;
		InuptLetterThread typeChar;
		// 【代码1】创建线程giveChar
		giveChar.setLetter(letter);
		giveChar.setSleepLength(3200);
		// 【代码2】创建线程typeChar
		typeChar.setLetter(letter);
		giveChar.start();
		typeChar.start();
	}
}
