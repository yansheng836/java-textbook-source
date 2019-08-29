package ch11.例子10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddRecord {
	String databaseName = "";       	// 数据库名
	String tableName = "";             	// 表名
	String number = "",        		// 商品号
			name = "",        			// 名称
			madeTime;       			// 生产日期
	double price;            			// 价格

	public AddRecord() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			System.out.print(e);
		}
	}

	public void setDatabaseName(String s) {
		databaseName = s.trim();
	}

	public void setTableName(String s) {
		tableName = s.trim();
	}

	public void setNumber(String s) {
		number = s.trim();
	}

	public void setName(String s) {
		name = s.trim();
	}

	public void setPrice(double n) {
		price = n;
	}

	public void setMadeTime(String b) {
		madeTime = b;
	}

	public String addRecord() {
		String str = "";
		Connection con;
		PreparedStatement sql;   // 预处理语句
		try {
			String uri = "jdbc:derby:" + databaseName + ";create=true";
			con = DriverManager.getConnection(uri);
			String insertCondition = "INSERT INTO " + tableName + " VALUES (?,?,?,?)";
			sql = con.prepareStatement(insertCondition);
			if (number.length() > 0) {
				sql.setString(1, number);
				sql.setString(2, name);
				sql.setString(3, madeTime);
				sql.setDouble(4, price);
				int m = sql.executeUpdate();
				if (m != 0)
					str = "对表中添加" + m + "条记录成功";
				else
					str = "添加记录失败";
			} else {
				str = "必须要有雇员号";
			}
			con.close();
		} catch (SQLException e) {
			str = "没有提供添加的数据或" + e;
		}
		return str;
	}
}
