package ch5.�ϻ�ʵ������.ʵ��2;

public class MainClass {
	public static void main(String args[]) {
		Student zhang = new Student();
		double area = zhang.area(new Rect(2, 3), new Circle(5.2), new Circle(12));
		System.out.printf("2��Բ��1������ͼ�ε�����ͣ�\n%10.3f", area);
	}
}
