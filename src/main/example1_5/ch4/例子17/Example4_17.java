package ch4.����17;

public class Example4_17 {
	public static void main(String args[]) {
		Yuan circle = new Yuan();
		circle.setRadius(123);
		System.out.println("circle�İ뾶��" + circle.getRadius());
		// circle.radius=-523;�ǷǷ��ģ���Ϊcircle����Student����
		circle.setRadius(-523);
		System.out.println("circle�İ뾶��" + circle.getRadius());
	}
}
