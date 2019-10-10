package ch9.例子17;

//静态导入Calendar类的静态常量:
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
		String 年 = String.valueOf(calendar.get(YEAR)), 月 = String.valueOf(calendar.get(MONTH) + 1),
				日 = String.valueOf(calendar.get(DAY_OF_MONTH));
		int hour = calendar.get(HOUR_OF_DAY), minute = calendar.get(MINUTE), second = calendar.get(SECOND);
		System.out.println("现在的时间是：");
		System.out.print("" + 年 + "年" + 月 + "月" + 日 + "日");
		System.out.println(" " + hour + "时" + minute + "分" + second + "秒");
		int year1 = 1949, month1 = 9, day1 = 1;
		calendar.set(year1, month1 - 1, day1);  // 将日历翻到1949年10月1日,注意9表示十月
		long time1 = calendar.getTimeInMillis();
		int year2 = 2015;
		int month2 = 9;
		int day2 = 1;
		calendar.set(year2, month2 - 1, day2);  // 将日历翻到2015年10月1日
		long time2 = calendar.getTimeInMillis();
		long days = (time2 - time1) / (1000 * 60 * 60 * 24);
		System.out.printf("%d-%d-%d和%d-%d-%d\n相隔%d天\n", year2, month2 + 1, day2, year1, month1 + 1, day1,
				days);
	}
}
