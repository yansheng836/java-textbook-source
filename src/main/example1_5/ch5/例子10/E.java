package ch5.例子10;

class People {
	String name;

	void showName() {
		System.out.println("***\n");
	}
}

class American extends People {
	void showName() {
		System.out.println("美国人姓名是名在前姓在后:" + name);
	}
}

class Chinese extends People {
	void showName() {
		System.out.println("中国人姓名是姓在前名在后:" + name);
	}
}

public class E {
	public static void main(String args[]) {
		People people = null;
		American american = new American();
		people = american;      // people是american对象的上转型对象。
		people.name = "MadingSun.Lee"; // 等同于american.name="MadingSun.Lee";
		people.showName();  // 等同于american调用重写的showName()方法
		Chinese chinese = new Chinese();
		people = chinese;       // people是chinese对象的上转型对象。
		people.name = "张三林";  // 等同于chinese.name=""张三林";
		people.showBodyMess();  // 等同于chinese调用重写的showName()方法
	}
}
