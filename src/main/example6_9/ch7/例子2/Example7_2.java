package ch7.����2;

public class Example7_2 {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4 };
		char b[] = { 'a', 'b', 'c', 'd' };
		for (int n = 0; n < a.length; n++) { // ��ͳ��ʽ
			System.out.println(a[n]);
		}
		for (int n = 0; n < b.length; n++) { // ��ͳ��ʽ
			System.out.println(b[n]);
		}
		for (int i : a) {    // ѭ������i����ȡ����a��ÿһ��Ԫ�ص�ֵ(�Ǵ�ͳ��ʽ)
			System.out.println(i);
		}
		for (char ch : b) { // ѭ������ch����ȡ����b��ÿһ��Ԫ�ص�ֵ(�Ǵ�ͳ��ʽ)
			System.out.println(ch);
		}
	}
}
