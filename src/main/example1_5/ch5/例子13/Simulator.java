package ch5.例子13;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.print("现在播放" + animal.getAnimalName() + "类的声音:");
		animal.cry();
	}
}
