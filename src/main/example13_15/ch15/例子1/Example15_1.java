package ch15.����1;

//����JFrame�ľ�̬����
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import javax.swing.JFrame;

public class Example15_1 {
	public static void main(String args[]) {
		JFrame window1 = new JFrame("��������");
		JFrame window2 = new JFrame("�˳�����");
		window1.setBounds(60, 100, 188, 108);
		window2.setBounds(260, 100, 188, 108);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		window2.setVisible(true);
		window2.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
