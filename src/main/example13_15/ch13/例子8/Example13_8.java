package ch13.����8;

public class Example13_8 {
	public static void main(String args[]) {
		House house = new House();
		house.setCake(10);
		Thread antOne, antTwo;
		antOne = new Thread(house);
		antOne.setName("������");
		antTwo = new Thread(house);
		antTwo.setName("������");
		antOne.start();
		antTwo.start();
	}
}
