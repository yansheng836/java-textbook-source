package ch15.例子9;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowMouse extends JFrame {
	JTextField text;
	JButton button;
	JTextArea textArea;
	MousePolice police;

	WindowMouse() {
		init();
		setBounds(100, 100, 420, 220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		text = new JTextField(8);
		textArea = new JTextArea(5, 28);
		police = new MousePolice();
		police.setJTextArea(textArea);
		text.addMouseListener(police);
		button = new JButton("按钮");
		button.addMouseListener(police);
		addMouseListener(police);
		add(button);
		add(text);
		add(new JScrollPane(textArea));
	}
}
