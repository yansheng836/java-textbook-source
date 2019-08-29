package ch5.上机实践代码.实验2;

public class Student {
	public double area(Geometry... p) {
		double sum = 0;
		for (int i = 0; i < p.length; i++) {
			sum = sum + p[i].getArea();
		}
		return sum;
	}
}
