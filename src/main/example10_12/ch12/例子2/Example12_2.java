package ch12.例子2;

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
		System.out.println("钢琴协奏曲:黄河");
	}
}

class Violin {
	public void play() {
		System.out.println("小提琴协奏曲:梁祝");
	}
}

public class Example12_2 {
	public static void main(String args[]) {
		Student zhang = new Student();
		System.out.println("学生听:");
		zhang.listen(new Piano());
		Teacher teacher = new Teacher();
		System.out.println("老师听:");
		teacher.listen(new Violin());
	}
}
