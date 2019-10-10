package ch4.例子3;

public class Example4_3 {
	public static void main(String args[]) {
		Vehicle carOne, carTwo, carThree;
		carOne = new Vehicle();
		carTwo = new Vehicle();
		carOne.speedUp(60);
		carTwo.speedUp(90);
		System.out.println("carOne目前的速度：" + carOne.getSpeed());
		System.out.println("carTwo目前的速度：" + carTwo.getSpeed());
		carOne = carTwo;
		carThree = carTwo;
		System.out.println("carOne目前的速度：" + carOne.getSpeed());
		System.out.println("carTwo目前的速度：" + carTwo.getSpeed());
		System.out.println("carThree目前的速度：" + carOne.getSpeed());
		carOne = null;
		System.out.println("carOne目前的速度：" + carOne.getSpeed());
	}
}
