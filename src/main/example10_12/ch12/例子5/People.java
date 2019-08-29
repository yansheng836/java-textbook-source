package ch12.例子5;

public class People implements Comparable<People> {
	int height, weight;

	public People(int h, int w) {
		height = h;
		weight = w;
	}

	public int compareTo(People b) { // 两个People对象相等当且仅当二者的height值相等。
		return (this.height - b.height);
	}
}
