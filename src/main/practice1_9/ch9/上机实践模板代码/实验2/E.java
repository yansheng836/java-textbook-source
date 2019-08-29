package ch9.上机实践模板代码.实验2;

import java.util.StringTokenizer;

public class E {
	public static void main(String args[]) {
		String s1 = "苹果：56.7圆，香蕉：12圆，芒果:19.8圆";
		String s2 = "酱油：6.7圆，精盐：0.8圆，榨菜:9.8圆";
		ComputePice jisuan = new ComputePice();
		String regex = "[^0123456789.]+";// 匹配所有非数字字符串
		String s1_number = s1.replaceAll(regex, "*");
		double priceSum = jisuan.compute(s1_number, "*");
		System.out.printf("\"%s\"价格总和:\n%f圆\n", s1, priceSum);
		String s2_number = s2.replaceAll(regex, "#");
		priceSum = jisuan.compute(s2_number, "#");
		System.out.printf("\"%s\"价格总和:\n%f圆\n", s2, priceSum);
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
