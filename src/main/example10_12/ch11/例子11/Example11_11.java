package ch11.����11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example11_11 {
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
			float n = 500;
			con = DriverManager.getConnection("jdbc:derby:shop;create=true");
			con.setAutoCommit(false);       // �ر��Զ��ύģʽ
			sql = con.createStatement();
			rs = sql.executeQuery("SELECT * FROM goods WHERE number='001'");
			rs.next();
			float priceOne = rs.getFloat("price");
			priceOne = priceOne - n;
			rs = sql.executeQuery("SELECT * FROM goods WHERE number='002'");
			rs.next();
			float priceTwo = rs.getFloat("price");
			priceTwo = priceTwo + n;
			sql.executeUpdate("UPDATE goods SET price =" + priceOne + " WHERE number='001'");
			sql.executeUpdate("UPDATE goods SET price=" + priceTwo + " WHERE number='002'");
			con.commit(); // ��ʼ������
			con.close();
		} catch (SQLException e) {
			try {
				con.rollback();          // �������������Ĳ���
			} catch (SQLException exp) {
			}
			System.out.println(e);
		}
	}
}
