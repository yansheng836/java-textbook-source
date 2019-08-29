package ch6.上机实践模板代码.实验1;

class ShiZhang implements Commander {
	final int MAXSoldierNumber = 1000;
	int soldierNumber = 1;
	String name;

	ShiZhang(String s) {
		name = s;
	}

	public void battle(String mess) {
		System.out.println(name + "接到作战命令:" + mess);
		System.out.println(name + "指派" + soldierNumber + "人参与作战");
		System.out.println(name + "保证完成任务");
	}

	void setSoldierNumber(int m) {
		if (m > MAXSoldierNumber) {
			soldierNumber = MAXSoldierNumber;
		} else if (m < MAXSoldierNumber && m > 0) {
			soldierNumber = m;
		}
	}
}
