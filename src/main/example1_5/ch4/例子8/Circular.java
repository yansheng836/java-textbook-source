package ch4.Р§зг8;

public class Circular {
	Circle bottom;
	double height;

	void setBottom(Circle c) {
		bottom = c;
	}

	void setHeight(double h) {
		height = h;
	}

	double getVolme() {
		return bottom.getArea() * height / 3.0;
	}

	double getBottomRadius() {
		return bottom.getRadius();
	}

	public void setBottomRadius(double r) {
		bottom.setRadius(r);
	}
}
