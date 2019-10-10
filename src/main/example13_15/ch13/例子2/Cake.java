package ch13.例子2;

public class Cake {
	int size;  // 蛋糕的大小

	public void setSize(int n) {
		size = n;
	}

	public int getSize() {
		return size;
	}

	public void lost(int m) {
		if (size - m >= 0)
			size = size - m;
	}
}
