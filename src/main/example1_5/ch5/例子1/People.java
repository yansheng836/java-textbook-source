package ch5.例子1;

public class People {
	double height = 170, weight = 67.9;

	protected void tellHeightAndWeight() {
		System.out.printf("我的体重和身高:%2.2fkg,%2.2fcm\n", weight, height);
	}
}
