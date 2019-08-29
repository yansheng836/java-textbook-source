package ch3.例子2;

public class Administrator {
	void giveMess(int number) {
		if (number / 10000 <= 0 || number / 10000 >= 10) {
			System.out.println("请给出5位数的彩票号码");
		} else {
			int d1 = number % 10;  // 尾号
			int d2 = number % 100; // 后2位数
			int d3 = number % 1000;// 后3位数
			switch (d1) {
			case 9:
			case 3:
			case 1:
				System.out.println("彩票是三等奖");
				break;
			default:
				System.out.println("彩票不是三等奖");
			}
			switch (d2) {
			case 29:
			case 46:
			case 21:
				System.out.println("彩票是二等奖");
				break;
			default:
				System.out.println("彩票不是二等奖");
			}
			switch (d3) {
			case 875:
			case 326:
			case 596:
				System.out.println("彩票是一等奖");
				break;
			default:
				System.out.println("彩票不是一等奖");
			}
		}
	}
}
