package ch15.例子5;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowActionEvent extends JFrame {
	JTextField text;
	ReaderListen listener;

	public WindowActionEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		text = new JTextField(10);
		listener = new ReaderListen();
		text.addActionListener(listener);   // text是事件源,listener是监视器
		add(text);
	}
}
