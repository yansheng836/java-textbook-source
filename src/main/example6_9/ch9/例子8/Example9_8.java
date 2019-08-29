package ch9.例子8;

import java.util.Scanner;

public class Example9_8 {
	public static void main(String args[]) {
		String sourceString = "今晚十点进攻";
		EncryptAndDecrypt person = new EncryptAndDecrypt();
		System.out.println("输入密码加密:" + sourceString);
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		String secret = person.encrypt(sourceString, password);
		System.out.println("密文:" + secret);
		System.out.println("输入解密密码");
		password = scanner.nextLine();
		String source = person.decrypt(secret, password);
		System.out.println("明文:" + source);
	}
}
