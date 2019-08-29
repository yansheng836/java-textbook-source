package ch13.例子8;

public class Example13_8 {
	public static void main(String args[]) {
		House house = new House();
		house.setCake(10);
		Thread antOne, antTwo;
		antOne = new Thread(house);
		antOne.setName("红蚂蚁");
		antTwo = new Thread(house);
		antTwo.setName("黑蚂蚁");
		antOne.start();
		antTwo.start();
	}
}
