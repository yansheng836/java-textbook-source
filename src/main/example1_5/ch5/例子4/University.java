package ch5.例子4;

public class University {
	void enterRule(double math, double english, double chinese) {
		double total = math + english + chinese;
		if (total >= 200)
			System.out.println("考分" + total + "达到大学最低录取线");
		else
			System.out.println("考分" + total + "未达到大学最低录取线");
	}
}
