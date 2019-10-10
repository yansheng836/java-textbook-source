package ch11.Р§зг1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example11_1 {
	public static void main(String args[]) {
		Connection con;
		Statement sql;
		ResultSet rs;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			System.out.print(e);
		}
		try {
			con = DriverManager.getConnection("jdbc:derby:shop;create=true");
			sql = con.createStatement();
			rs = sql.executeQuery("SELECT * FROM goods WHERE price>3000");
			while (rs.next()) {
				String number = rs.getString(1);
				String name = rs.getString(2);
				Date date = rs.getDate("madeTime");
				double price = rs.getDouble("price");
				System.out.print(number + "|");
				System.out.print(name + "|");
				System.out.print(date.toString() + "|");
				System.out.println(price + "|");
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
