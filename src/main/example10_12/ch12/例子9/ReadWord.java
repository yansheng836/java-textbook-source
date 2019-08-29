package ch12.例子9;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class ReadWord {
	public void putWordToHashMap(HashMap<String, String> hashtable, File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String englishWord = sc.next();
				String chineseWord = sc.next();
				hashtable.put(englishWord, chineseWord);
			}
		} catch (Exception e) {
		}
	}
}
