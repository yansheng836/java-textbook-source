package ch4.����3;

public class Vehicle {
	double speed;             // ������������,�̻��ٶ�
	int power;                // ������������,�̻�����

	void speedUp(int s) {      // ��������,�̻����ٹ���
		speed = speed + s;
	}

	void speedDown(int d) {   // ��������,�̻����ٹ���
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
