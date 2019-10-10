package ch15.����19;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyDialog extends JDialog implements ActionListener { // �Ի�����
	JTextField inputTitle;
	String title;

	MyDialog(JFrame f, String s) { // ���췽��
		super(f, s);
		inputTitle = new JTextField(10);
		inputTitle.addActionListener(this);
		setLayout(new FlowLayout());
		add(new JLabel("���봰�ڵ��±���"));
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
