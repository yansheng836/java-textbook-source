package ch4.����3;

public class Example4_3 {
	public static void main(String args[]) {
		Vehicle carOne, carTwo, carThree;
		carOne = new Vehicle();
		carTwo = new Vehicle();
		carOne.speedUp(60);
		carTwo.speedUp(90);
		System.out.println("carOneĿǰ���ٶȣ�" + carOne.getSpeed());
		System.out.println("carTwoĿǰ���ٶȣ�" + carTwo.getSpeed());
		carOne = carTwo;
		carThree = carTwo;
		System.out.println("carOneĿǰ���ٶȣ�" + carOne.getSpeed());
		System.out.println("carTwoĿǰ���ٶȣ�" + carTwo.getSpeed());
		System.out.println("carThreeĿǰ���ٶȣ�" + carOne.getSpeed());
		carOne = null;
		System.out.println("carOneĿǰ���ٶȣ�" + carOne.getSpeed());
	}
}
