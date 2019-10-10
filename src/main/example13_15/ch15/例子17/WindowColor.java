package ch15.����17;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class WindowColor extends JFrame implements ActionListener {
	JButton button;

	WindowColor() {
		button = new JButton("����ɫ�Ի���");
		button.addActionListener(this);
		setLayout(new FlowLayout());
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(this, "��ɫ��", getContentPane().getBackground());
		if (newColor != null) {
			getContentPane().setBackground(newColor);
		}
	}
}
