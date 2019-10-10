package ch9.����17;

//��̬����Calendar��ľ�̬����:
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SECOND;
import static java.util.Calendar.YEAR;

import java.util.Calendar;
import java.util.Date;

public class Example9_17 {
	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		String �� = String.valueOf(calendar.get(YEAR)), �� = String.valueOf(calendar.get(MONTH) + 1),
				�� = String.valueOf(calendar.get(DAY_OF_MONTH));
		int hour = calendar.get(HOUR_OF_DAY), minute = calendar.get(MINUTE), second = calendar.get(SECOND);
		System.out.println("���ڵ�ʱ���ǣ�");
		System.out.print("" + �� + "��" + �� + "��" + �� + "��");
		System.out.println(" " + hour + "ʱ" + minute + "��" + second + "��");
		int year1 = 1949, month1 = 9, day1 = 1;
		calendar.set(year1, month1 - 1, day1);  // ����������1949��10��1��,ע��9��ʾʮ��
		long time1 = calendar.getTimeInMillis();
		int year2 = 2015;
		int month2 = 9;
		int day2 = 1;
		calendar.set(year2, month2 - 1, day2);  // ����������2015��10��1��
		long time2 = calendar.getTimeInMillis();
		long days = (time2 - time1) / (1000 * 60 * 60 * 24);
		System.out.printf("%d-%d-%d��%d-%d-%d\n���%d��\n", year2, month2 + 1, day2, year1, month1 + 1, day1,
				days);
	}
}
