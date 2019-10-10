package ch13.例子2;

public class Example13_2 {
	public static void main(String args[]) {
		Cake cake = new Cake();
		int size = 10;
		cake.setSize(size);
		System.out.println("蛋糕大小是" + size + "克");
		Ant antRed = new Ant("红蚂蚁", cake);
		Ant antBlack = new Ant("黑蚂蚁", cake);
		antRed.start();
		antBlack.start();
	}
}
