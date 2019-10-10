package ch4.����7;

public class Rational {
	int numerator;   // ����
	int denominator; // ��ĸ

	void setNumeratorAndDenominator(int fenzi, int fenmu) { // ���÷��Ӻͷ�ĸ
		int m = 1, n = 1;
		if (fenzi < 0)
			m = -1 * fenzi;
		if (fenmu < 0)
			n = -1 * fenmu;
		if (fenzi == 0) {
			numerator = 0;
			denominator = 1;
			return;
		}
		int c = f(m, n);           // �������Լ��
		numerator = fenzi / c;
		denominator = fenmu / c;
		if (numerator < 0 && denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}

	int getNumerator() {
		return numerator;
	}

	int getDenominator() {
		return denominator;
	}

	int f(int a, int b) { // ��a��b�����Լ��
		if (a < b) {
			int c = a;
			a = b;
			b = c;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	Rational add(Rational r) {  // �ӷ�����
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b + denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational sub(Rational r) {  // ��������
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b - denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational muti(Rational r) { // �˷�����
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational div(Rational r) { // ��������
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b;
		int newDenominator = denominator * a;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}
}
