package ch15.����16;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowEnter extends JFrame implements ActionListener {
	JTextField inputName;
	JTextArea save;

	WindowEnter() {
		inputName = new JTextField(22);
		inputName.addActionListener(this);
		save = new JTextArea();
		add(inputName, BorderLayout.NORTH);
		add(new JScrollPane(save), BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String s = inputName.getText();
		int n = JOptionPane.showConfirmDialog(this, "ȷ���Ƿ���ȷ", "ȷ�϶Ի���", JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			save.append("\n" + s);
		} else if (n == JOptionPane.NO_OPTION) {
			inputName.setText(null);
		}
	}
}
