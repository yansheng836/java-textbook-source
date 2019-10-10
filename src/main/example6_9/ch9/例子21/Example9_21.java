package ch9.例子21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Example9_21 {
   public static void main(String args[ ]) { 
     Pattern p;          //模式对象
     Matcher m;         //匹配对象
     String regex="(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
     p=Pattern.compile(regex);  //初试化模式对象
     String s=
"清华大学网址:www.tsinghua.edu.cn,邮电出版社的网址:http://www.ptpress. com";
     m=p.matcher(s);  //用待匹配字符序列初始化匹配对象
     while(m.find()) {
        String str=m.group();
        System.out.println(str);
     } 
     System.out.println("剔除字符串中的网站地址后得到的字符串:");
     String result=m.replaceAll("");
     System.out.println(result);
   }
}
