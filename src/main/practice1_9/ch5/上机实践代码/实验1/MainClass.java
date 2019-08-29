package ch5.上机实践代码.实验1;

public class MainClass {
	public static void main(String args[]) {
		Dog dog = new Dog("小黄狗");
		Cat cat = new Cat("小花猫");
		dog.showName();
		dog.cry();
		dog.swimming();
		cat.showName();
		cat.cry();
		cat.climbUpTree();
	}
}
