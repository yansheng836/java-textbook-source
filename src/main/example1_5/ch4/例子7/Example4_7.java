package ch4.Р§зг7;

public class Example4_7 {
	public static void main(String args[]) {
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		r1.setNumeratorAndDenominator(3, 5);
		int r1Fenzi = r1.getNumerator();
		int r1Fenmu = r1.getDenominator();
		r2.setNumeratorAndDenominator(3, 2);
		int r2Fenzi = r2.getNumerator();
		int r2Fenmu = r2.getDenominator();
		Rational result = r1.add(r2);
		int resultFenzi = result.getNumerator();
		int resultFenmu = result.getDenominator();
		System.out.printf("\n%d/%d+%d/%d = %d/%d", r1Fenzi, r1Fenmu, r2Fenzi, r2Fenmu, resultFenzi,
				resultFenmu);
		result = r1.sub(r2);
		resultFenzi = result.getNumerator();
		resultFenmu = result.getDenominator();
		System.out.printf("\n%d/%d+%d/%d = %d/%d", r1Fenzi, r1Fenmu, r2Fenzi, r2Fenmu, resultFenzi,
				resultFenmu);
		result = r1.muti(r2);
		resultFenzi = result.getNumerator();
		resultFenmu = result.getDenominator();
		System.out.printf("\n%d/%d+%d/%d = %d/%d", r1Fenzi, r1Fenmu, r2Fenzi, r2Fenmu, resultFenzi,
				resultFenmu);
		result = r1.div(r2);
		resultFenzi = result.getNumerator();
		resultFenmu = result.getDenominator();
		System.out.printf("\n%d/%d+%d/%d = %d/%d", r1Fenzi, r1Fenmu, r2Fenzi, r2Fenmu, resultFenzi,
				resultFenmu);
	}
}
