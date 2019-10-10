package ch9.����20;

import java.text.DecimalFormat;
public class Example9_20 {
   public static void main(String args[]){
      double number=98765.123456;
      System.out.println(number+"��ʽ��Ϊ��������6λ��С�����3λ:");
      DecimalFormat df=new DecimalFormat ("000000.000");
      String result=df.format(number);
      System.out.println(result);
      number=12345678.987654;
      System.out.printf("%f��ʽ��Ϊ��������2λ,С�����4λ(�������ְ�ǧ����):%n",number);
      df.applyPattern("#,##,#00.0000$"); 
      result=df.format(number);
      System.out.println(result);
      number=0.986796;
      System.out.println(number+"��ʽ��Ϊ�ٷ�����ǧ����:");
      df.applyPattern("0.0000%");
      result=df.format(number);
      System.out.println(result);
      df.applyPattern("0.0000\u2030");
      result=df.format(number);
      System.out.println(result);
      String money="9,576,769.345��";
      System.out.println(money+"ת��������:"); 
      df.applyPattern("#,##,##0.000");
      try {
            Number num = df.parse(money);   
            System.out.println(num.doubleValue()); 
      }
      catch(Exception exp){}  
   }
}
