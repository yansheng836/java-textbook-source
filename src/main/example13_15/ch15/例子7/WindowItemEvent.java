package ch15.����7;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FilenameFilter;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowItemEvent extends JFrame {
	JComboBox choice;
	JTextArea textShow;
	PoliceListen listener;

	public WindowItemEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		choice = new JComboBox();
		choice.addItem("��ѡ���ļ�:");
		File dir = new File(".");
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");
		String[] fileName = dir.list(fileAccept);
		for (String name : fileName) {
			choice.addItem(name);
		}
		textShow = new JTextArea(9, 30);
		listener = new PoliceListen();
		listener.setJComboBox(choice);
		listener.setJTextArea(textShow);
		choice.addItemListener(listener);   // choice���¼�Դ,listener�Ǽ�����
		add(choice);
		add(new JScrollPane(textShow));
	}

	class FileAccept implements FilenameFilter { // �ڲ���
		private String extendName;

		public void setExtendName(String s) {
			extendName = "." + s;
		}

		public boolean accept(File dir, String name) {
			return name.endsWith(extendName);
		}
	}
}
