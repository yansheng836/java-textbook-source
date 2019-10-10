package ch5.例子8;

public class Card {
	String title;

	Card() {
		title = "新年快乐!";
	}

	Card(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
