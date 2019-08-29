package ch2.例子5;

public class Machine {
	public void estimate(int height, double weight) {
		double number = (height - 100) / weight;
		if (number >= 1.1)
			System.out.println("偏瘦");
		else if (number < 1.1 && number >= 0.96)
			System.out.println("正常");
		else if (number < 0.96)
			System.out.println("偏胖");
	}
}
