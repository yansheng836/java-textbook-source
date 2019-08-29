package ch5.例子7;

public class BankOfDalian extends Bank {
	double year;

	public double computerInterest() {
		super.year = (int) year;
		double remainNumber = year - (int) year;
		int day = (int) (remainNumber * 1000);
		interest = super.computerInterest() + day * 0.00012 * savedMoney;
		System.out.printf("%d元存在大连银行%d年零%d天的利息:%f元\n", savedMoney, super.year, day, interest);
		return interest;
	}
}
