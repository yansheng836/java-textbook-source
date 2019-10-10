package ch11.�ϻ�ʵ��ģ�����.ʵ��2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TurnMoney {
	public static void main(String args[]) {
		Connection con = null;
		Statement sta = null;
		ResultSet rs;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con = DriverManager.getConnection("jdbc:derby://127.0.0.1:1527//bank;create=true");
			sta = con.createStatement();
			String card1 = "create table card1(number char(20) primary key ,amount double)";
			String card2 = "create table card2(number char(20) primary key ,amount double)";
			sta.execute(card1);// ������salary,������Ѵ��ڣ��������´�����������SQLException
			sta.execute(card2);
		} catch (Exception e) {
			System.out.println("" + e);
		} finally {
			try {
				sta.executeUpdate("insert into card1 values('zhangsan', 900)");  // �����¼
				sta.executeUpdate("insert into card2 values('xixiShop', 100)");
			} catch (SQLException ee) {
			}
		}
		try {
			double n = 100;
			// ������1���ر��Զ��ύģʽ
			rs = sta.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
			rs.next();
			double amountOne = rs.getDouble("amount");
			System.out.println("ת�˲���֮ǰzhangsan��Ǯ������:" + amountOne);
			rs = sta.executeQuery("SELECT * FROM card2 WHERE number='xixiShop'");
			rs.next();
			double amountTwo = rs.getDouble("amount");
			System.out.println("ת�˲���֮ǰxixiShop��Ǯ������:" + amountTwo);
			amountOne = amountOne - n;
			amountTwo = amountTwo + n;
			sta.executeUpdate("UPDATE card1 SET amount =" + amountOne + " WHERE number ='zhangsan'");
			sta.executeUpdate("UPDATE card2 SET amount =" + amountTwo + " WHERE number ='xixiShop'");
			con.commit(); // ��ʼ������,��������쳣ֱ��ִ��catch��
			// ������2���ָ��Զ��ύģʽ
			rs = sta.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
			rs.next();
			amountOne = rs.getDouble("amount");
			System.out.println("ת�˲���֮��zhangsan��Ǯ������:" + amountOne);
			rs = sta.executeQuery("SELECT * FROM card2 WHERE number='xixiShop'");
			rs.next();
			amountTwo = rs.getDouble("amount");
			System.out.println("ת�˲���֮��xixiShop��Ǯ������:" + amountTwo);
			con.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}
