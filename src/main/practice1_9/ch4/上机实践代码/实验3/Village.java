package ch4.�ϻ�ʵ������.ʵ��3;

class Village {
	static int treeAmount;     // ģ��ɭ������ľ������
	int peopleNumber;       // ��ׯ������
	String name;            // ��ׯ������

	Village(String s) {
		name = s;
	}

	void treePlanting(int n) {
		treeAmount = treeAmount + n;
		System.out.println(name + "ֲ��" + n + "��");
	}

	void fellTree(int n) {
		if (treeAmount - n >= 0) {
			treeAmount = treeAmount - n;
			System.out.println(name + "����" + n + "��");
		} else {
			System.out.println("����ľ�ɷ�");
		}
	}

	static int lookTreeAmount() {
		return treeAmount;
	}

	void addPeopleNumber(int n) {
		peopleNumber = peopleNumber + n;
		System.out.println(name + "������" + n + "��");
	}
}
