package ch11.例子12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example11_12 {
	public static void main(String args[]) {
		Connection con = null;
		Statement sql;
		ResultSet rs;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("" + e);
		}
		try {
			double n = 500;
			con = DriverManager.getConnection("jdbc:derby:shop;create=true");
			con.setAutoCommit(false);       // 关闭自动提交模式
			sql = con.createStatement();
			sql.addBatch("UPDATE goods SET price =5555 WHERE number='001'");
			sql.addBatch("UPDATE goods SET name ='haierTV' WHERE number='001'");
			sql.addBatch("INSERT INTO goods VALUES ('008','水杯','2015-12-20',39)");
			int[] number = sql.executeBatch();// 开始批处理，返回被执行的SQL语句的序号
			con.commit();   // 进行事务处理
			System.out.println("共有" + number.length + "条SQL语句被执行");
			sql.clearBatch();
			con.close();
		} catch (SQLException e) {
			try {
				con.rollback();          // 撤销事务所做的操作
			} catch (SQLException exp) {
			}
			System.out.println(e);
		}
	}
}
