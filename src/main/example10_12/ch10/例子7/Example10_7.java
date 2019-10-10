package ch10.����7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example10_7 {
	public static void main(String args[]) {
		File file = new File("goods.txt");
		String content[] = { "��Ʒ�б�:", "���ӻ�,2567Ԫ/̨", "ϴ�»�,3562.Ԫ/̨", "����,6573Ԫ/̨" };
		try {
			FileWriter outOne = new FileWriter(file);
			BufferedWriter outTwo = new BufferedWriter(outOne);
			for (String str : content) {
				outTwo.write(str);
				outTwo.newLine();
			}
			outTwo.close();
			outOne.close();
			FileReader inOne = new FileReader(file);
			BufferedReader inTwo = new BufferedReader(inOne);
			String s = null;
			while ((s = inTwo.readLine()) != null) {
				System.out.println(s);
			}
			inOne.close();
			inTwo.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
