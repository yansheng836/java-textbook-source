package ch5.����7;

public class Bank {
	int savedMoney;
	int year;
	double interest;

	public double computerInterest() {
		interest = year * 0.035 * savedMoney;
		System.out.printf("%dԪ��������%d�����Ϣ:%fԪ\n", savedMoney, year, interest);
		return interest;
	}
}
