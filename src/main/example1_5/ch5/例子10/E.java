package ch5.����10;

class People {
	String name;

	void showName() {
		System.out.println("***\n");
	}
}

class American extends People {
	void showName() {
		System.out.println("����������������ǰ���ں�:" + name);
	}
}

class Chinese extends People {
	void showName() {
		System.out.println("�й�������������ǰ���ں�:" + name);
	}
}

public class E {
	public static void main(String args[]) {
		People people = null;
		American american = new American();
		people = american;      // people��american�������ת�Ͷ���
		people.name = "MadingSun.Lee"; // ��ͬ��american.name="MadingSun.Lee";
		people.showName();  // ��ͬ��american������д��showName()����
		Chinese chinese = new Chinese();
		people = chinese;       // people��chinese�������ת�Ͷ���
		people.name = "������";  // ��ͬ��chinese.name=""������";
		people.showBodyMess();  // ��ͬ��chinese������д��showName()����
	}
}
