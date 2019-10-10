package ch6.例子4;

interface CompurerAverage {
	public double average(double... x);
}

class Gymnastics implements CompurerAverage {
	public double average(double... x) {
		int count = x.length;
		double aver = 0, temp = 0;
		for (int i = 0; i < count; i++) {
			for (int j = i; j < count; j++) {
				if (x[j] < x[i]) {
					temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
			}
		}
		for (int i = 1; i < count - 1; i++) {
			aver = aver + x[i];
		}
		if (count > 2)
			aver = aver / (count - 2);
		else
			aver = 0;
		return aver;
	}
}

class School implements CompurerAverage {
	public double average(double... x) {
		int count = x.length;
		double aver = 0;
		for (double param : x) {
			aver = aver + param;
		}
		aver = aver / count;
		return aver;
	}
}

public class Example6_4 {
	public static void main(String args[]) {
		CompurerAverage computer;
		computer = new Gymnastics();
		double result = computer.average(9.87, 9.76, 9.99, 9.12, 9.67, 9.73);
		System.out.printf("体操选手最后得分%5.3f\n", result);
		computer = new School();
		result = computer.average(65, 89, 76, 56, 88, 90, 98, 46);
		System.out.println("班级考试平均分数:" + result);
	}
}
