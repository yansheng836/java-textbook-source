package ch3.����2;

import java.util.Scanner;

public class Example3_2 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("�����Ʊ�Żس�ȷ��");
		int number = reader.nextInt();
		Administrator person = new Administrator();
		person.giveMess(number);
	}
}
