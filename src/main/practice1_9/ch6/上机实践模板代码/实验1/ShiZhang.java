package ch6.�ϻ�ʵ��ģ�����.ʵ��1;

class ShiZhang implements Commander {
	final int MAXSoldierNumber = 1000;
	int soldierNumber = 1;
	String name;

	ShiZhang(String s) {
		name = s;
	}

	public void battle(String mess) {
		System.out.println(name + "�ӵ���ս����:" + mess);
		System.out.println(name + "ָ��" + soldierNumber + "�˲�����ս");
		System.out.println(name + "��֤�������");
	}

	void setSoldierNumber(int m) {
		if (m > MAXSoldierNumber) {
			soldierNumber = MAXSoldierNumber;
		} else if (m < MAXSoldierNumber && m > 0) {
			soldierNumber = m;
		}
	}
}
