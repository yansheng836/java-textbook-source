package ch8.����4;

public class Example8_4 {
	public static void main(String args[]) {
		int n = 0, m = 0, t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89"); // �����쳣,ת��catch
			t = 7777;  // tû�л��ᱻ��ֵ
		} catch (NumberFormatException e) {
			System.out.println("�����쳣:" + e.getMessage());
		}
		System.out.println("n=" + n + ",m=" + m + ",t=" + t);
		try {
			m = Integer.parseInt("123");
			n = Integer.parseInt("678");
			t = 5555;  // t����ֵ
		} catch (NumberFormatException e) {
			System.out.println("�����쳣:" + e.getMessage());
		}
		System.out.println("n=" + n + ",m=" + m + ",t=" + t);
	}
}
