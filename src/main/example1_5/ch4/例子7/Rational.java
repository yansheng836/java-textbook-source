package ch4.例子7;

public class Rational {
	int numerator;   // 分子
	int denominator; // 分母

	void setNumeratorAndDenominator(int fenzi, int fenmu) { // 设置分子和分母
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
		int c = f(m, n);           // 计算最大公约数
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

	int f(int a, int b) { // 求a和b的最大公约数
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

	Rational add(Rational r) {  // 加法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b + denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational sub(Rational r) {  // 减法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b - denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational muti(Rational r) { // 乘法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}

	Rational div(Rational r) { // 除法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b;
		int newDenominator = denominator * a;
		Rational result = new Rational();
		result.setNumeratorAndDenominator(newNumerator, newDenominator);
		return result;
	}
}
