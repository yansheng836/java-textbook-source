package ch2.����5;

public class Example2_5 {
	public static void main(String args[]) {
		People ����, ����;
		Machine �����;
		����� = new Machine();
		���� = new People();
		����.weight = 82.5F;
		����.height = 176;
		����.speak();
		�����.estimate(����.height, ����.weight);
		���� = new People();
		����.weight = 77.2f;
		����.height = 186;
		����.speak();
		�����.estimate(����.height, ����.weight);
	}
}
