package ch12.����9;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Example12_9 {
	public static void main(String args[]) {
		HashMap<String, String> hashtable;
		File file = new File("word.txt");
		ReadWord read = new ReadWord();
		hashtable = new HashMap<String, String>();
		read.putWordToHashMap(hashtable, file);
		Scanner scanner = new Scanner(System.in);
		System.out.print("����Ҫ��ѯ��Ӣ�ĵ���:");
		while (scanner.hasNextLine()) {
			String englishWord = scanner.nextLine();
			if (englishWord.length() == 0)
				break;
			if (hashtable.containsKey(englishWord)) {
				String chineseWord = hashtable.get(englishWord);
				System.out.println(chineseWord);
			} else {
				System.out.println("û�д˵���");
			}
			System.out.print("����Ҫ��ѯ��Ӣ�ĵ���:");
		}
	}
}
