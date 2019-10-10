package ch15.例子5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderListen implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String fileName = e.getActionCommand();
		System.out.println(fileName + "内容如下:");
		try {
			File file = new File(fileName);
			FileReader inOne = new FileReader(file);
			BufferedReader inTwo = new BufferedReader(inOne);
			String s = null;
			while ((s = inTwo.readLine()) != null) {
				System.out.println(s);
			}
			inOne.close();
			inTwo.close();
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}
}
