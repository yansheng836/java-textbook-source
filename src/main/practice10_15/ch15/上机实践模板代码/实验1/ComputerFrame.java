package ch15.上机实践模板代码.实验1;

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
	JMenu choiceGrade; // 选择级别的菜单
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
		choiceGrade = new JMenu("选择级别");
		grade1 = new JMenuItem("幼儿级别");
		grade2 = new JMenuItem("儿童级别");
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
		// 【代码1】 //创建textOne,其可见字符长是5
		textTwo = new JTextField(5);
		textResult = new JTextField(5);
		operatorLabel = new JLabel("+");
		operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));
		message = new JLabel("你还没有回答呢");
		getProblem = new JButton("获取题目");
		giveAnswer = new JButton("确认答案");
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
		// 【代码2】//将teacherZhang注册为getProblem的ActionEvent事件监视器
		// 【代码3】//将teacherZhang注册为giveAnswer的ActionEvent事件监视器
		// 【代码4】//将teacherZhang注册为textResult的ActionEvent事件监视器
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
