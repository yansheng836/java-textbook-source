package ch2.�ϻ�ʵ������.ʵ��2;

public class GreekAlphabet {
	public static void main(String args[]) {
		int startPosition = 0, endPosition = 0;
		char cStart = '��', cEnd = '��';
		// ������1��//cStart��int��ת�������㣬���������ֵ��startPosition
		// ������2��//cEnd��int��ת�����㣬���������ֵ��endPosition
		System.out.println("ϣ����ĸ\'��\'��unicode���е�˳��λ��:" + startPosition);
		System.out.println("ϣ����ĸ��");
		for (int i = startPosition; i <= endPosition; i++) {
			char c = '\0';
			// ������3�� //i��char��ת�����㣬���������ֵ��c
			System.out.print(" " + c);
			if ((i - startPosition + 1) % 10 == 0)
				System.out.println("");
		}
	}
}
