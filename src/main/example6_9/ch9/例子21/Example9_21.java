package ch9.����21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Example9_21 {
   public static void main(String args[ ]) { 
     Pattern p;          //ģʽ����
     Matcher m;         //ƥ�����
     String regex="(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
     p=Pattern.compile(regex);  //���Ի�ģʽ����
     String s=
"�廪��ѧ��ַ:www.tsinghua.edu.cn,�ʵ���������ַ:http://www.ptpress. com";
     m=p.matcher(s);  //�ô�ƥ���ַ����г�ʼ��ƥ�����
     while(m.find()) {
        String str=m.group();
        System.out.println(str);
     } 
     System.out.println("�޳��ַ����е���վ��ַ��õ����ַ���:");
     String result=m.replaceAll("");
     System.out.println(result);
   }
}
