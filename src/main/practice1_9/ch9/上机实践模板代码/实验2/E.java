package ch9.�ϻ�ʵ��ģ�����.ʵ��2;

import java.util.StringTokenizer;

public class E {
	public static void main(String args[]) {
		String s1 = "ƻ����56.7Բ���㽶��12Բ��â��:19.8Բ";
		String s2 = "���ͣ�6.7Բ�����Σ�0.8Բ��ե��:9.8Բ";
		ComputePice jisuan = new ComputePice();
		String regex = "[^0123456789.]+";// ƥ�����з������ַ���
		String s1_number = s1.replaceAll(regex, "*");
		double priceSum = jisuan.compute(s1_number, "*");
		System.out.printf("\"%s\"�۸��ܺ�:\n%fԲ\n", s1, priceSum);
		String s2_number = s2.replaceAll(regex, "#");
		priceSum = jisuan.compute(s2_number, "#");
		System.out.printf("\"%s\"�۸��ܺ�:\n%fԲ\n", s2, priceSum);
	}
}

class ComputePice {
	double compute(String s, String fenge) {
		StringTokenizer fenxiOne = new StringTokenizer(s, fenge);
		double sum = 0;
		double digitItem = 0;
		while (fenxiOne.hasMoreTokens()) {
			String str = fenxiOne.nextToken();
			digitItem = Double.parseDouble(str);
			sum = sum + digitItem;
		}
		return sum;
	}
}
