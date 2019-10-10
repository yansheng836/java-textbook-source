package ch9.例子5;

import java.util.Date;

public class Example9_5 {
	public static void main(String args[]) {
		Date date = new Date();
		System.out.println(date.toString());
		TV tv = new TV("长虹电视");
		System.out.println(tv.toString());
	}
}
