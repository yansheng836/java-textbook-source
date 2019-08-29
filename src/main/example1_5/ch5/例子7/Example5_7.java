package ch5.例子7;

public class Example5_7 {
	public static void main(String args[]) {
		int amount = 5000;
		ConstructionBank bank1 = new ConstructionBank();
		bank1.savedMoney = amount;
		bank1.year = 5.216;
		double interest1 = bank1.computerInterest();
		BankOfDalian bank2 = new BankOfDalian();
		bank2.savedMoney = amount;
		bank2.year = 5.216;
		double interest2 = bank2.computerInterest();
		System.out.printf("两个银行利息相差%f\n", interest2 - interest1);
	}
}
