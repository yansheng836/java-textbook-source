package ch5.例子8;

public class ChristmasCard extends Card {
	String content;   // 子类新增的content

	ChristmasCard(String title, String content) {
		super(title);  // 调用父类的构造方法，即执行Card(title)
		this.content = content;
	}

	public void showCard() {
		System.out.println("*****" + getTitle() + "******");
		System.out.printf("%s", content);
	}
}
