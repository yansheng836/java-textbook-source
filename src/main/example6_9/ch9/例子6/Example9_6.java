package ch9.����6;

public class Example9_6 {
	public static void main(String args[]) {
		char[] a, b, c;
		String s = "2009��10��1���ǹ���60����";
		a = new char[2];
		s.getChars(11, 13, a, 0);
		System.out.println(a);
		c = "ʮһ�����ڼ䣬ѧУ���ż���".toCharArray();
		for (char ch : c)
			System.out.print(ch);
	}
}
