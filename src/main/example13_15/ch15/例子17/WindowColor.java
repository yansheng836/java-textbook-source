package ch15.例子17;

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
		button = new JButton("打开颜色对话框");
		button.addActionListener(this);
		setLayout(new FlowLayout());
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(this, "调色板", getContentPane().getBackground());
		if (newColor != null) {
			getContentPane().setBackground(newColor);
		}
	}
}
