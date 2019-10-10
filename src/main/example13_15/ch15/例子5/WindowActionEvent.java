package ch15.����5;

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
		text.addActionListener(listener);   // text���¼�Դ,listener�Ǽ�����
		add(text);
	}
}
