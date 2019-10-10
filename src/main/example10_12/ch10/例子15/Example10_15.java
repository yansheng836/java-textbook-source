package ch10.Р§зг15;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example10_15 {
	public static void main(String args[]) {
		File file = new File("cost.txt");
		Scanner sc = null;
		int sum = 0;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				try {
					int price = sc.nextInt();
					sum = sum + price;
					System.out.println(price);
				} catch (InputMismatchException exp) {
					String t = sc.next();
				}
			}
			System.out.println("Total Cost:" + sum + " dollar");
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}
