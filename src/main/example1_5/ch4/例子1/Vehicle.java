package ch4.例子1;

public class Vehicle {
	double speed;             // 变量声明部分,刻画速度
	int power;                // 变量声明部分,刻画功率

	void speedUp(int s) {      // 方法定义,刻画加速功能
		speed = speed + s;
	}

	void speedDown(int d) {   // 方法定义,刻画减速功能
		speed = speed - d;
	}

	void setPower(int p) {
		power = p;
	}

	int getPower() {
		return power;
	}

	double getSpeed() {
		return speed;
	}
}
