package ch9.例子10;

public class Example9_10 {
	public static void main(String args[]) {
		String str = "欢迎大家访问http://www.xiaojiang.cn了解、参观公司";
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		System.out.printf("剔除\n\"%s\"\n中的网站链接信息后得到的字符串:\n", str);
		str = str.replaceAll(regex, "");
		System.out.println(str);
	}
}
