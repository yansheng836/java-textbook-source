package ch10.上机实践模板代码.实验1;

import java.io.File;
import java.io.IOException;

public class AnalysisResult {
	public static void main(String args[]) {
		File fRead = new File("score.txt");
		File fWrite = new File("socreAnalysis.txt");
		try {
			// Writer out = 【代码1】//以尾加方式创建指向文件fWrite的out流
			// BufferedWriter bufferWrite = 【代码2】//创建指向out的bufferWrite流
			// Reader in = 【代码3】//创建指向文件fRead的in流
			// BufferedReader bufferRead =【代码4】//创建指向in的bufferRead流
			String str = null;
			while ((str = bufferRead.readLine()) != null) {
				double totalScore = Fenxi.getTotalScore(str);
				str = str + " 总分:" + totalScore;
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
