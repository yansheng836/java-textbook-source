package ch5.例子4;

public class ImportantUniversity extends University {
	void enterRule(double math, double english, double chinese) {
		double total = math + english + chinese;
		if (total >= 245)
			System.out.println("考分" + total + "达到重点大学最低录取线");
		else
			System.out.println("考分" + total + "未达到重点大学最低录取线");
	}
}
