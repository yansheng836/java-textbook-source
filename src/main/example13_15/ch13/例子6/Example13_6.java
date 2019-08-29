package ch13.例子6;

public class Example13_6 {
	public static void main(String args[]) {
		Road road = new Road();
		Thread police, driver;
		police = new Thread(road);
		driver = new Thread(road);
		police.setName("警察");
		driver.setName("司机");
		road.setAttachThread(driver);
		driver.start();
		police.start();
	}
}
