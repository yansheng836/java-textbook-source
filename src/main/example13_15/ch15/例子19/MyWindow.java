package ch15.����19;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener {
	JButton button;
	MyDialog dialog;

	MyWindow() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		button = new JButton("�򿪶Ի���");
		button.addActionListener(this);
		add(button, BorderLayout.NORTH);
		dialog = new MyDialog(this, "���ǶԻ���");  // �Ի���������MyWindow�����Ĵ���
		dialog.setModal(true);   // ��ģʽ�Ի���
	}

	public void actionPerformed(ActionEvent e) {
		dialog.setVisible(true);
		String str = dialog.getTitle();
		setTitle(str);
	}
}
