package ch2.上机实践代码.实验2;

public class GreekAlphabet {
	public static void main(String args[]) {
		int startPosition = 0, endPosition = 0;
		char cStart = 'α', cEnd = 'ω';
		// 【代码1】//cStart做int型转换据运算，并将结果赋值给startPosition
		// 【代码2】//cEnd做int型转换运算，并将结果赋值给endPosition
		System.out.println("希腊字母\'α\'在unicode表中的顺序位置:" + startPosition);
		System.out.println("希腊字母表：");
		for (int i = startPosition; i <= endPosition; i++) {
			char c = '\0';
			// 【代码3】 //i做char型转换运算，并将结果赋值给c
			System.out.print(" " + c);
			if ((i - startPosition + 1) % 10 == 0)
				System.out.println("");
		}
	}
}
