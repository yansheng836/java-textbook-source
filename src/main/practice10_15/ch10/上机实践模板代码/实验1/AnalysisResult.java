package ch10.�ϻ�ʵ��ģ�����.ʵ��1;

import java.io.File;
import java.io.IOException;

public class AnalysisResult {
	public static void main(String args[]) {
		File fRead = new File("score.txt");
		File fWrite = new File("socreAnalysis.txt");
		try {
			// Writer out = ������1��//��β�ӷ�ʽ����ָ���ļ�fWrite��out��
			// BufferedWriter bufferWrite = ������2��//����ָ��out��bufferWrite��
			// Reader in = ������3��//����ָ���ļ�fRead��in��
			// BufferedReader bufferRead =������4��//����ָ��in��bufferRead��
			String str = null;
			while ((str = bufferRead.readLine()) != null) {
				double totalScore = Fenxi.getTotalScore(str);
				str = str + " �ܷ�:" + totalScore;
				System.out.println(str);
				bufferWrite.write(str);
				bufferWrite.newLine();
			}
			bufferRead.close();
			bufferWrite.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
