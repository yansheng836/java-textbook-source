package ch2.例子5;

public class Example2_5 {
	public static void main(String args[]) {
		People 张三, 李四;
		Machine 体检器;
		体检器 = new Machine();
		张三 = new People();
		张三.weight = 82.5F;
		张三.height = 176;
		张三.speak();
		体检器.estimate(张三.height, 张三.weight);
		李四 = new People();
		李四.weight = 77.2f;
		李四.height = 186;
		李四.speak();
		体检器.estimate(李四.height, 李四.weight);
	}
}
