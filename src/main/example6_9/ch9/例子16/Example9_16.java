package ch9.例子16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example9_16 {
	public static void main(String args[]) {
		Date nowTime = new Date();
		System.out.println(nowTime);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);
		String timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		pattern = "G yyyy年MMMd日E HH时mm分ss秒z";
		SDF = new SimpleDateFormat("G yyyy年MMMd日E HH时mm分ss秒z");
		timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		long time = System.currentTimeMillis();
		System.out.println("现在是公元后:" + time + "毫秒");
	}
}
