package ch9.����10;

public class Example9_10 {
	public static void main(String args[]) {
		String str = "��ӭ��ҷ���http://www.xiaojiang.cn�˽⡢�ι۹�˾";
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		System.out.printf("�޳�\n\"%s\"\n�е���վ������Ϣ��õ����ַ���:\n", str);
		str = str.replaceAll(regex, "");
		System.out.println(str);
	}
}
