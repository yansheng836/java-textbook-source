package ch7.�ϻ�ʵ��ģ�����.ʵ��1;

import java.util.Arrays;

public class CopyArray {
	public static void main (String args[ ]) {
	      int [] a = {1,2,3,4,500,600,700,800};
	      int [] b,c,d;
	      System.out.println(Arrays.toString(a));
	      b = Arrays.copyOf(a,a.length);
	      System.out.println(Arrays.toString(b)); 
	      c =������1��//Arrays����copyOf������������a��ǰ4��Ԫ�� 
	      System.out.println(������2��);//Arrays����toString������������c��Ԫ��ֵ�ı�ʾ��ʽ
	      d = ������3��//Arrays����copyOfRange������������a�ĺ�4��Ԫ��
	      System.out.println(Arrays.toString(d));
	      ������4��  //��-100��������c�����һ��Ԫ��
	      d[d.length-1] = -200;
	      System.out.println(Arrays.toString(a));
	   }
}
