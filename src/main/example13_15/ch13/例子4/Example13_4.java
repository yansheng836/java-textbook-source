package ch13.����4;

public class Example13_4 {
	public static void main(String args[]) {
		House house = new House();
		house.setCake(10);
		Thread antOne, antTwo;
		antOne = new Thread(house);
		antOne.setName("������");
		antTwo = new Thread(house);  // antTwo��antOne��Ŀ�������ͬ
		antTwo.setName("������");
		house.setAttachThread(antTwo);
		antOne.start();  // �������ȳ�
	}
}
