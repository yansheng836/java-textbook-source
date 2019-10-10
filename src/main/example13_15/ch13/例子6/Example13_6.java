package ch13.Àý×Ó6;

public class Example13_6 {
	public static void main(String args[]) {
		Road road = new Road();
		Thread police, driver;
		police = new Thread(road);
		driver = new Thread(road);
		police.setName("¾¯²ì");
		driver.setName("Ë¾»ú");
		road.setAttachThread(driver);
		driver.start();
		police.start();
	}
}
