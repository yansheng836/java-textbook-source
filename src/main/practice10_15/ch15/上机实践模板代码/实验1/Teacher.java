package ch15.�ϻ�ʵ��ģ�����.ʵ��1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Teacher implements ActionListener {
	int numberOne, numberTwo;
	String operator = "";
	boolean isRight;
	Random random;  // ���ڸ��������
	int maxInteger;  // ��Ŀ����������
	JTextField textOne, textTwo, textResult;
	JLabel operatorLabel, message;

	Teacher() {
		random = new Random();
	}

	public void setMaxInteger(int n) {
		maxInteger = n;
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("getProblem")) {
			numberOne = random.nextInt(maxInteger) + 1;// 1��maxInteger֮��������;
			numberTwo = random.nextInt(maxInteger) + 1;
			double d = Math.random(); // ��ȡ(0,1)֮��������
			if (d >= 0.5)
				operator = "+";
			else
				operator = "-";
			textOne.setText("" + numberOne);
			textTwo.setText("" + numberTwo);
			operatorLabel.setText(operator);
			message.setText("��ش�");
			textResult.setText(null);
		} else if (str.equals("answer")) {
			String answer = textResult.getText();
			try {
				int result = Integer.parseInt(answer);
				if (operator.equals("+")) {
					if (result == numberOne + numberTwo)
						message.setText("��ش���ȷ");
					else
						message.setText("��ش����");
				} else if (operator.equals("-")) {
					if (result == numberOne - numberTwo)
						message.setText("��ش���ȷ");
					else
						message.setText("��ش����");
				}
			} catch (NumberFormatException ex) {
				message.setText("�����������ַ�");
			}
		}
	}

	public void setJTextField(JTextField... t) {
		textOne = t[0];
		textTwo = t[1];
		textResult = t[2];
	}

	public void setJLabel(JLabel... label) {
		operatorLabel = label[0];
		message = label[1];
	}
}
