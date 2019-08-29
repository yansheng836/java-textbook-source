package ch10.例子13;

import java.io.Serializable;

public class TV implements Serializable {
	String name;
	int price;

	public void setName(String s) {
		name = s;
	}

	public void setPrice(int n) {
		price = n;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
