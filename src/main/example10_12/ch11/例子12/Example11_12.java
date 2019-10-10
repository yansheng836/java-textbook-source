package ch11.����12;

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
			con.setAutoCommit(false);       // �ر��Զ��ύģʽ
			sql = con.createStatement();
			sql.addBatch("UPDATE goods SET price =5555 WHERE number='001'");
			sql.addBatch("UPDATE goods SET name ='haierTV' WHERE number='001'");
			sql.addBatch("INSERT INTO goods VALUES ('008','ˮ��','2015-12-20',39)");
			int[] number = sql.executeBatch();// ��ʼ���������ر�ִ�е�SQL�������
			con.commit();   // ����������
			System.out.println("����" + number.length + "��SQL��䱻ִ��");
			sql.clearBatch();
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
