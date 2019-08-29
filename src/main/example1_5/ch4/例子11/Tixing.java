package ch4.例子11;

public class Tixing {
	double above, bottom, height;

	Tixing(double a, double b, double h) {
		above = a;
		bottom = b;
		height = h;
	}

	double getArea() {
		return (above + bottom) * height / 2;
	}
}
