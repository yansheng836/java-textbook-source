package ch13.�ϻ�ʵ��ģ�����.ʵ��1;

public class TypeKey {
	public static void main(String args[]) {
		System.out.println("������ϰ(����#��������)");
		System.out.printf("������ʾ����ĸ(�س�)\n");
		Letter letter;
		letter = new Letter();
		GiveLetterThread giveChar;
		InuptLetterThread typeChar;
		// ������1�������߳�giveChar
		giveChar.setLetter(letter);
		giveChar.setSleepLength(3200);
		// ������2�������߳�typeChar
		typeChar.setLetter(letter);
		giveChar.start();
		typeChar.start();
	}
}
