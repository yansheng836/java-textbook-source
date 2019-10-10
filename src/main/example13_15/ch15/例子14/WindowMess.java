package ch15.����14;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowMess extends JFrame implements ActionListener {
	JTextField inputEnglish;
	JTextArea show;
	String regex = "[a-zZ-Z]+";

	WindowMess() {
		inputEnglish = new JTextField(22);
		inputEnglish.addActionListener(this);
		show = new JTextArea();
		add(inputEnglish, BorderLayout.NORTH);
		add(show, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == inputEnglish) {
			String str = inputEnglish.getText();
			if (str.matches(regex)) {
				show.append(str + ",");
			} else { // ���������桱��Ϣ�Ի���
				JOptionPane.showMessageDialog(this, "�������˷Ƿ��ַ�", "��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
				inputEnglish.setText(null);
			}
		}
	}
}
