
package ch4.�ϻ�ʵ������.ʵ��1;

public class
public class Tank {
	// ������1��// ����double�ͱ���speed,�̻��ٶ�
	// ������2��// ����int�ͱ���bulletAmount,�̻��ڵ�����
	void speedUp(int s) {
		// ������3�� //��s+speed��ֵ��speed
	}

	void speedDown(int d) {  
	       if(speed-d>=0) 
//	         ������4��  //��speed-d��ֵ��speed
	       else 
	         speed = 0;
	    }

	void setBulletAmount(int m) {
		bulletAmount = m;
	}

	int getBulletAmount() {
		return bulletAmount;
	}

	double getSpeed() {
		return speed;
	}

	void fire() {
		if (bulletAmount >= 1) {
			// ������5�� //��bulletAmount-1��ֵ��bulletAmount
			System.out.println("���һ���ڵ�");
		} else {
			System.out.println("û���ڵ���,�޷�����");
		}
	}
}{

}
