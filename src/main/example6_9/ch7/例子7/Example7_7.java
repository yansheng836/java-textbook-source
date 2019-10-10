package ch7.Àý×Ó7;

enum Color {
	ºì, »Æ, ÂÌ
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
