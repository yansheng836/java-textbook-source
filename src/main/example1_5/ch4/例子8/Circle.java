package ch4.Р§зг8;

public class Circle {
	double radius, area;

	void setRadius(double r) {
		if (r > 0) {
			radius = r;
		}
	}

	double getRadius() {
		return radius;
	}

	double getArea() {
		area = 3.14 * radius * radius;
		return area;
	}
}
