package ch15.����13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowTriangle extends JFrame implements ActionListener {
	Triangle triangle;              // ���ݶ���
	JTextField textA, textB, textC;   // ���ݶ������ͼ
	JTextArea showArea;            // ���ݶ������ͼ
	JButton controlButton;         // ����������

	WindowTriangle() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		triangle = new Triangle();
		textA = new JTextField(5);
		textB = new JTextField(5);
		textC = new JTextField(5);
		showArea = new JTextArea();
		controlButton = new JButton("�������");
		JPanel pNorth = new JPanel();
		pNorth.add(new JLabel("��A:"));
		pNorth.add(textA);
		pNorth.add(new JLabel("��B:"));
		pNorth.add(textB);
		pNorth.add(new JLabel("��C"));
		pNorth.add(textC);
		pNorth.add(controlButton);
		controlButton.addActionListener(this);
		add(pNorth, BorderLayout.NORTH);
		add(new JScrollPane(showArea), BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			double a = Double.parseDouble(textA.getText().trim());
			double b = Double.parseDouble(textB.getText().trim());
			double c = Double.parseDouble(textC.getText().trim());
			triangle.setA(a);          // ��������
			triangle.setB(b);
			triangle.setC(c);
			String area = triangle.getArea();
			showArea.append("������" + a + "," + b + "," + c + "�����:");
			showArea.append(area + "\n");  // ������ͼ
		} catch (Exception ex) {
			showArea.append("\n" + ex + "\n");
		}
	}
}
