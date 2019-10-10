package ch5.����6;

class Factory {
	public HomeEletricity make() { // ������������HomeEletricity��
		HomeEletricity machine = new HomeEletricity();
		return machine;
	}
}

class TVFactory extends Factory {
	public Television make() {  // ��д������������HomeEletricity�������:Television
		Television tv = new Television();
		tv.setWeight(21);
		return tv;
	}
}

class IceboxFactory extends Factory {
	public Icebox make() {  // ��д������������HomeEletricity�������:Icebox
		Icebox icebox = new Icebox();
		icebox.setWeight(67);
		return icebox;
	}
}

public class Example5_6 {
	public static void main(String args[]) {
		TVFactory factory1 = new TVFactory();
		Television tv = factory1.make();   // factory1������д�ķ���
		tv.showMess();
		IceboxFactory factory2 = new IceboxFactory();
		Icebox icebox = factory2.make();   // factory2������д�ķ���
		icebox.showMess();
	}
}
