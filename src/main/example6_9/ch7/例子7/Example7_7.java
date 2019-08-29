package ch7.例子7;

enum Color {
	红, 黄, 绿
}

public class Example7_7 {
	public static void main(String args[]) {
		for (Color a : Color.values()) {
			for (Color b : Color.values()) {
				if (a != b)
					System.out.print(a + "," + b + "|");
			}
		}
	}
}
