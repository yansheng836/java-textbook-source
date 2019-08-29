package ch15.例子6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PoliceListen implements ActionListener {
	JTextField textInput;
	JTextArea textShow;

	public void setJTextField(JTextField text) {
		textInput = text;
	}

	public void setJTextArea(JTextArea area) {
		textShow = area;
	}

	public void actionPerformed(ActionEvent e) {
		textShow.setText(null);
		try {
			File file = new File(textInput.getText());
			FileReader inOne = new FileReader(file);
			BufferedReader inTwo = new BufferedReader(inOne);
			String s = null;
			while ((s = inTwo.readLine()) != null) {
				textShow.append(s + "\n");
			}
			inOne.close();
			inTwo.close();
		} catch (Exception ee) {
			textShow.append(ee.toString());
		}
	}
}
