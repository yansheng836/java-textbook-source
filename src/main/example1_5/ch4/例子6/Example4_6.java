package ch4.����6;

public class Example4_6 {
	public static void main(String args[]) {
		Computer computer = new Computer();
		int result = computer.getSum(203, 178, 56, 2098);
		System.out.println("1203,178,56,2098�ĺ�:" + result);
		result = computer.getSum(66, 12, 5, 89, 2, 51);
		System.out.println("66,12,5,89,2,51�ĺ�:" + result);
	}
}
