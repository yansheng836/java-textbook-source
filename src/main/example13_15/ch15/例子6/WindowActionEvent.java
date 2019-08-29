package ch15.例子6;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowActionEvent extends JFrame {
	JTextField inputText;
	JTextArea textShow;
	JButton button;
	PoliceListen listener;

	public WindowActionEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		inputText = new JTextField(10);
		button = new JButton("读取");
		textShow = new JTextArea(9, 30);
		listener = new PoliceListen();
		listener.setJTextField(inputText);
		listener.setJTextArea(textShow);
		inputText.addActionListener(listener);  // inputText是事件源,listener是监视器
		button.addActionListener(listener);     // button是事件源,listener是监视器
		add(inputText);
		add(button);
		add(new JScrollPane(textShow));
	}
}
