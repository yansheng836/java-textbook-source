package ch4.����4;

public class Example4_4 {
	public static void main(String args[]) {
		Circle circle = new Circle();
		double w = 12.76;
		circle.setRadius(w);
		System.out.println("Բ�İ뾶��" + circle.getRadius());
		System.out.println("Բ�������" + circle.getArea());
		System.out.println("�����򷽷�����r����ֵ��w��ֵΪ100");
		w = 100;
		System.out.println("w=" + w);
		System.out.println("Բ�İ뾶��" + circle.getRadius());
	}
}
