package ch15.����10;

import java.awt.FlowLayout;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowMove extends JFrame {
	JTextField text[] = new JTextField[3];
	JButton b;

	WindowMove() {
		setLayout(new FlowLayout());
		for (int i = 0; i < 3; i++) {
			text[i] = new JTextField(7);
			text[i].addKeyListener((KeyListener) this);  // ���Ӽ����¼�
			text[i].addFocusListener((FocusListener) this);
			add(text[i]);
		}
		b = new JButton("ȷ��");
		add(b);
		text[0].requestFocusInWindow();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
