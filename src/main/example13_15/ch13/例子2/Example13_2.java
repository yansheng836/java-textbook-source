package ch13.����2;

public class Example13_2 {
	public static void main(String args[]) {
		Cake cake = new Cake();
		int size = 10;
		cake.setSize(size);
		System.out.println("�����С��" + size + "��");
		Ant antRed = new Ant("������", cake);
		Ant antBlack = new Ant("������", cake);
		antRed.start();
		antBlack.start();
	}
}
