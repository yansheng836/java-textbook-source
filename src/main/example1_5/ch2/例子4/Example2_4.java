package ch2.例子4;

public class Example2_4 {
	public static void main(String args[]) {
		char ch1 = '国', ch2 = '庆';
		int p1 = 969, p2 = 12353;
		System.out.println(ch1 + "在Unicode表中的位置:" + (int) ch1);
		System.out.println(ch2 + "在Unicode表中的位置:" + (int) ch2);
		System.out.println("第" + p1 + "个位置上的字符是:" + (char) p1);
		System.out.println("第" + p2 + "个位置上的字符是:" + (char) p2);
	}
}
