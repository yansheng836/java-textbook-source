package ch12.����2;

interface Listen<E> {
	void listen(E x);
}

class Student implements Listen<Piano> {
	public void listen(Piano p) {
		p.play();
	}
}

class Teacher implements Listen<Violin> {
	public void listen(Violin v) {
		v.play();
	}
}

class Piano {
	public void play() {
		System.out.println("����Э����:�ƺ�");
	}
}

class Violin {
	public void play() {
		System.out.println("С����Э����:��ף");
	}
}

public class Example12_2 {
	public static void main(String args[]) {
		Student zhang = new Student();
		System.out.println("ѧ����:");
		zhang.listen(new Piano());
		Teacher teacher = new Teacher();
		System.out.println("��ʦ��:");
		teacher.listen(new Violin());
	}
}
