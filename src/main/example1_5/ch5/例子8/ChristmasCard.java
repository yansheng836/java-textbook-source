package ch5.����8;

public class ChristmasCard extends Card {
	String content;   // ����������content

	ChristmasCard(String title, String content) {
		super(title);  // ���ø���Ĺ��췽������ִ��Card(title)
		this.content = content;
	}

	public void showCard() {
		System.out.println("*****" + getTitle() + "******");
		System.out.printf("%s", content);
	}
}
