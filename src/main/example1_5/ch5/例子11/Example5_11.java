package ch5.例子11;

class EspecialCar {
	void cautionSound() {
	}
}

class PoliceCar extends EspecialCar {
	void cautionSound() {
		System.out.println("zhua..zhua..zhua...");
	}
}

class AmbulanceCar extends EspecialCar {
	void cautionSound() {
		System.out.println("jiu..jiu..jiu...");
	}
}

class FireCar extends EspecialCar {
	void cautionSound() {
		System.out.println("huo..huo..huo...");
	}
}

public class Example5_11 {
	public static void main(String args[]) {
		EspecialCar car = new PoliceCar(); // car是警车的上转型对象
		car.cautionSound();
		car = new AmbulanceCar(); // car是救护车的上转型对象
		car.cautionSound();
		car = new FireCar();      // car是消防车的上转型对象
		car.cautionSound();
	}
}
