package ch13.�ϻ�ʵ��ģ�����.ʵ��1;

public class GiveLetterThread extends Thread {
	Letter letter;
	char startChar = 'a', endChar = 'z';
	int sleepLength = 5000;

	public void setLetter(Letter letter) {
		this.letter = letter;
	}

	public void setSleepLength(int n) {
		sleepLength = n;
	}

	public void run() {
       char c = startChar;
       while(true) {
          letter.setChar(c);
          System.out.printf("��ʾ���ַ�:%c\n ",letter.getChar());
          try{  
//        	  ������3��//����sleep����ʹ���߳��ж�sleepLength����
          }
          catch(InterruptedException e){}

          c = (char)(c+1);
          if(c>endChar)  
             c = startChar;
        }
    }
}
