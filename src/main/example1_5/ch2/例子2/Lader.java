package ch2.例子2;

public class Lader {
	double above;  // 梯形的上底
	double bottom;
	double height;

	double getArea() {
		return (above + bottom) * height / 2;
	}
}
