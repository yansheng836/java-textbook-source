package ch5.例子8;

public class Example5_8 {
	public static void main(String args[]) {
		String title = "Happy New Year To You";
		String content = "\t牛年耕耘\n\t谷穗满仓\n\t出生牛犊\n\t喜迎虎年\n";
		ChristmasCard card = new ChristmasCard(title, content);
		card.showCard();
	}
}
