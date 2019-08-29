package ch4.例子17;

public class Yuan {
	private double radius;

	public void setRadius(double r) {
		if (r >= 0) {
			radius = r;
		}
	}

	public double getRadius() {
		return radius;
	}

	double getArea() {
		return 3.14 * radius * radius;
	}
}
