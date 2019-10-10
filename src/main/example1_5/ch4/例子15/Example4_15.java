package ch4.例子15;

import ch4.例子14.tom.jiafei.Triangle;

public class Example4_15 {
	public static void main(String args[]) {
		Triangle tri = new Triangle(6, 7, 10);
		tri.计算面积();
		tri.修改三边(3, 4, 5);
		tri.计算面积();
	}
}
