package ch4.����2;

public class Example4_2 {
	public static void main(String args[]) {
		Vehicle car1, car2;       // ����2������
		car1 = new Vehicle(); // Ϊ����car1���������ʹ��new �������Ĭ�ϵĹ��췽��
		car2 = new Vehicle(); // Ϊ����car2���������ʹ��new �������Ĭ�ϵĹ��췽��
		car1.setPower(128);
		car2.setPower(76);
		System.out.println("car1�Ĺ����ǣ�" + car1.getPower());
		System.out.println("car2�Ĺ����ǣ�" + car2.getPower());
		car1.speedUp(80);
		car2.speedUp(100);
		System.out.println("car1Ŀǰ���ٶȣ�" + car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�" + car2.getSpeed());
		car1.speedDown(10);
		car2.speedDown(20);
		System.out.println("car1Ŀǰ���ٶȣ�" + car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�" + car2.getSpeed());
	}
}
