package ch12.����5;

public class People implements Comparable<People> {
	int height, weight;

	public People(int h, int w) {
		height = h;
		weight = w;
	}

	public int compareTo(People b) { // ����People������ȵ��ҽ������ߵ�heightֵ��ȡ�
		return (this.height - b.height);
	}
}
