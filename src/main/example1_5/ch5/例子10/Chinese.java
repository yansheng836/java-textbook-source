package ch5.例子10;

public class Chinese extends People10 {
	void showBodyMess() {
		System.out.printf("身高:%5dcm\t体重:%3.2fkg\n", height, weight);
	}

	void speakChinese() {
		System.out.println("我是中国人");
	}
}
