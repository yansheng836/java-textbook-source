package ch5.����11;

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
		EspecialCar car = new PoliceCar(); // car�Ǿ�������ת�Ͷ���
		car.cautionSound();
		car = new AmbulanceCar(); // car�ǾȻ�������ת�Ͷ���
		car.cautionSound();
		car = new FireCar();      // car������������ת�Ͷ���
		car.cautionSound();
	}
}
