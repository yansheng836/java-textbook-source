package ch13.����6;

public class Example13_6 {
	public static void main(String args[]) {
		Road road = new Road();
		Thread police, driver;
		police = new Thread(road);
		driver = new Thread(road);
		police.setName("����");
		driver.setName("˾��");
		road.setAttachThread(driver);
		driver.start();
		police.start();
	}
}
