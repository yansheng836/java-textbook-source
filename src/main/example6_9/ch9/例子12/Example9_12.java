package ch9.例子12;

public class Example9_12 {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer();
		str.append("大家好");
		System.out.println("str:" + str);
		System.out.println("length:" + str.length());
		System.out.println("capacity:" + str.capacity());
		str.setCharAt(0, 'w');
		str.setCharAt(1, 'e');
		System.out.println(str);
		str.insert(2, " are all");
		System.out.println(str);
		int index = str.indexOf("好");
		str.replace(index, str.length(), " right");
		System.out.println(str);
	}
}
