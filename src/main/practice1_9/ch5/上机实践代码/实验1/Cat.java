package ch5.�ϻ�ʵ������.ʵ��1;

class Cat extends Animal {
	Cat() {
		name = "è";
	}

	Cat(String s) {
		name = s;
	}

	// ������3�� //��д�����cry�����������������ģ�⹷�е�����
	public void climbUpTree() {
		System.out.println(name + "������");
	}
}
