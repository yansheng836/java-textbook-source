package ch10.�ϻ�ʵ��ģ�����.ʵ��2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class WordStatistic {
	Vector<String> allWord, noSameWord;
	File file = new File("english.txt");
	Scanner sc = null; // ����Scanner sc���ں���ġ�����1���д����ö���
	String regex;

	WordStatistic() {
	      allWord = new Vector<String>();
	      noSameWord = new Vector<String>();
	      //regex���ɿո����ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ
	      regex= "[\\s\\d\\p{Punct}]+"; 
//	      try{  sc = ������1�� //����ָ��file��sc 
//	         ������2��//sc����useDelimiter(String regex)����,���������regex
	      }
	      catch(IOException exp) {
	         System.out.println(exp.toString());
	      } 
	   }

	void setFileName(String name) {
		file = new File(name);
		try {
			sc = new Scanner(file);
			sc.useDelimiter(regex);
		} catch (IOException exp) {
			System.out.println(exp.toString());
		}
	}

	public void wordStatistic() {
		try {
			while (sc.hasNext()) {
				String word = sc.next();
				allWord.add(word);
				if (!noSameWord.contains(word))
					noSameWord.add(word);
			}
		} catch (Exception e) {
		}
	}

	public Vector<String> getAllWord() {
		return allWord;
	}

	public Vector<String> getNoSameWord() {
		return noSameWord;
	}
}
