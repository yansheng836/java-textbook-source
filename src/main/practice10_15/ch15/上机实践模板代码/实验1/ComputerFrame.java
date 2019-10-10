package ch15.�ϻ�ʵ��ģ�����.ʵ��1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ComputerFrame extends JFrame {
	/**  
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar menubar;
	JMenu choiceGrade; // ѡ�񼶱�Ĳ˵�
	JMenuItem grade1, grade2;
	JTextField textOne, textTwo, textResult;
	JButton getProblem, giveAnswer;
	JLabel operatorLabel, message;
	Teacher teacherZhang;

	ComputerFrame() {
		teacherZhang = new Teacher();
		teacherZhang.setMaxInteger(20);
		setLayout(new FlowLayout());
		menubar = new JMenuBar();
		choiceGrade = new JMenu("ѡ�񼶱�");
		grade1 = new JMenuItem("�׶�����");
		grade2 = new JMenuItem("��ͯ����");
		grade1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherZhang.setMaxInteger(10);
			}
		});
		grade2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherZhang.setMaxInteger(50);
			}
		});
		choiceGrade.add(grade1);
		choiceGrade.add(grade2);
		menubar.add(choiceGrade);
		setJMenuBar(menubar);
		// ������1�� //����textOne,��ɼ��ַ�����5
		textTwo = new JTextField(5);
		textResult = new JTextField(5);
		operatorLabel = new JLabel("+");
		operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));
		message = new JLabel("�㻹û�лش���");
		getProblem = new JButton("��ȡ��Ŀ");
		giveAnswer = new JButton("ȷ�ϴ�");
		add(textOne);
		add(operatorLabel);
		add(textTwo);
		add(new JLabel("="));
		add(textResult);
		add(giveAnswer);
		add(message);
		add(getProblem);
		textResult.requestFocus();
		textOne.setEditable(false);
		textTwo.setEditable(false);
		getProblem.setActionCommand("getProblem");
		textResult.setActionCommand("answer");
		giveAnswer.setActionCommand("answer");
		teacherZhang.setJTextField(textOne, textTwo, textResult);
		teacherZhang.setJLabel(operatorLabel, message);
		// ������2��//��teacherZhangע��ΪgetProblem��ActionEvent�¼�������
		// ������3��//��teacherZhangע��ΪgiveAnswer��ActionEvent�¼�������
		// ������4��//��teacherZhangע��ΪtextResult��ActionEvent�¼�������
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
