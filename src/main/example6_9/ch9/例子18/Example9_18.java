package ch9.����18;

public class Example9_18 {
	public static void main(String args[]) {
		CalendarBean1 cb = new CalendarBean1();
		cb.setYear(2015);
		cb.setMonth(7);
		String[] a = cb.getCalendar();// ���غ����һά����
		char[] str = "��һ����������".toCharArray();
		for (char c : str) {
			System.out.printf("%3c", c);
		}
		for (int i = 0; i < a.length; i++) {     // �������a
			if (i % 7 == 0)
				System.out.println("");  // ����
			System.out.printf("%4s", a[i]);
		}
	}
}
