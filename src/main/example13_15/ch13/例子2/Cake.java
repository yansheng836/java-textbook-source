package ch13.����2;

public class Cake {
	int size;  // ����Ĵ�С

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
