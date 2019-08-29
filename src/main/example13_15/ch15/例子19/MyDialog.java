package ch15.例子19;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyDialog extends JDialog implements ActionListener { // 对话框类
	JTextField inputTitle;
	String title;

	MyDialog(JFrame f, String s) { // 构造方法
		super(f, s);
		inputTitle = new JTextField(10);
		inputTitle.addActionListener(this);
		setLayout(new FlowLayout());
		add(new JLabel("输入窗口的新标题"));
		add(inputTitle);
		setBounds(60, 60, 100, 100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		title = inputTitle.getText();
		setVisible(false);
	}

	public String getTitle() {
		return title;
	}
}
