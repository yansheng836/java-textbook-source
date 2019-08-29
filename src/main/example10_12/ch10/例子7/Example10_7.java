package ch10.例子7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example10_7 {
	public static void main(String args[]) {
		File file = new File("goods.txt");
		String content[] = { "商品列表:", "电视机,2567元/台", "洗衣机,3562.元/台", "冰箱,6573元/台" };
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
