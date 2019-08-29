package ch5.例子3;

public class Goods {
	public double weight;

	public void oldSetWeight(double w) {
		weight = w;
		System.out.println("double型的weight=" + weight);
	}

	public double oldGetPrice() {
		double price = weight * 10;
		return price;
	}
}
