package ch2.Àý×Ó5;

public class Machine {
	public void estimate(int height, double weight) {
		double number = (height - 100) / weight;
		if (number >= 1.1)
			System.out.println("Æ«ÊÝ");
		else if (number < 1.1 && number >= 0.96)
			System.out.println("Õý³£");
		else if (number < 0.96)
			System.out.println("Æ«ÅÖ");
	}
}
