package ch12.上机实践模板代码.实验2;

public class Book implements Comparable {
	double price;
	String name;

	public void setPrice(double c) {
		price = c;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public int compareTo(Object object) {
		Book bk = (Book) object;
		int difference = (int) ((this.getPrice() - bk.getPrice()) * 10000);
		return difference;
	}
}
