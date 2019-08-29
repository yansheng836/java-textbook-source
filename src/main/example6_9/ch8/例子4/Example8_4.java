package ch8.例子4;

public class Example8_4 {
	public static void main(String args[]) {
		int n = 0, m = 0, t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89"); // 发生异常,转向catch
			t = 7777;  // t没有机会被赋值
		} catch (NumberFormatException e) {
			System.out.println("发生异常:" + e.getMessage());
		}
		System.out.println("n=" + n + ",m=" + m + ",t=" + t);
		try {
			m = Integer.parseInt("123");
			n = Integer.parseInt("678");
			t = 5555;  // t被赋值
		} catch (NumberFormatException e) {
			System.out.println("发生异常:" + e.getMessage());
		}
		System.out.println("n=" + n + ",m=" + m + ",t=" + t);
	}
}
