package ch13.Àı×Ó8;

public class Example13_8 {
	public static void main(String args[]) {
		House house = new House();
		house.setCake(10);
		Thread antOne, antTwo;
		antOne = new Thread(house);
		antOne.setName("ºìÂìÒÏ");
		antTwo = new Thread(house);
		antTwo.setName("ºÚÂìÒÏ");
		antOne.start();
		antTwo.start();
	}
}
