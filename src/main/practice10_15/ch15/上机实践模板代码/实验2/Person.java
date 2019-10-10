package ch15.上机实践模板代码.实验2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class Person extends JButton implements FocusListener {
	int number;
	Color c = new Color(255, 245, 170);
	Font font = new Font("宋体", Font.BOLD, 12);

	Person(int number, String s) {
		super(s);
		setBackground(c);
		setFont(font);
		this.number = number;
		c = getBackground();
		addFocusListener(this);
	}

	public void focusGained(FocusEvent e) {
		setBackground(Color.red);
	}

	public void focusLost(FocusEvent e) {
		setBackground(c);
	}
}
