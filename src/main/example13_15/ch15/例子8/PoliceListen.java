package ch15.例子8;

import java.util.Arrays;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PoliceListen implements DocumentListener {
	JTextArea inputText, showText;

	public void setInputText(JTextArea text) {
		inputText = text;
	}

	public void setShowText(JTextArea text) {
		showText = text;
	}

	public void changedUpdate(DocumentEvent e) {
		String str = inputText.getText();
		// 空格、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式:
		String regex = "[\\s\\d\\p{Punct}]+";
		String words[] = str.split(regex);
		Arrays.sort(words);      // 按字典序从小到大排序
		showText.setText(null);
		for (String s : words)
			showText.append(s + ",");
	}

	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}

	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
}
