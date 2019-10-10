package ch6.例子2;

interface 收费 {
	public void 收取费用();
}

interface 调节温度 {
	public void controlTemperature();
}

class 公共汽车 implements 收费 {
	public void 收取费用() {
		System.out.println("公共汽车:一元/张,不计算公里数");
	}
}

class 出租车 implements 收费, 调节温度 {
	public void 收取费用() {
		System.out.println("出租车:3.20元/公里,起价3公里");
	}

	public void controlTemperature() {
		System.out.println("安装了Hair空调");
	}
}

class 电影院 implements 收费, 调节温度 {
	public void 收取费用() {
		System.out.println("电影院:门票,十元/张");
	}

	public void controlTemperature() {
		System.out.println("安装了中央空调");
	}
}

public class Example6_2 {
	public static void main(String args[]) {
		公共汽车 七路 = new 公共汽车();
		出租车 天宇 = new 出租车();
		电影院 红星 = new 电影院();
		七路.收取费用();
		天宇.收取费用();
		红星.收取费用();
		天宇.controlTemperature();
		红星.controlTemperature();
	}
}
