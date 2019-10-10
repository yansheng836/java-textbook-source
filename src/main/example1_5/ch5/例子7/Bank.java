package ch5.例子7;

public class Bank {
	int savedMoney;
	int year;
	double interest;

	public double computerInterest() {
		interest = year * 0.035 * savedMoney;
		System.out.printf("%d元存在银行%d年的利息:%f元\n", savedMoney, year, interest);
		return interest;
	}
}
