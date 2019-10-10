package ch11.例子9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PrepareQuery {
	String databaseName = "";    	// 数据库名
	String tableName = "";        	// 表名
	String SQL;                	// SQL语句

	public PrepareQuery() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	public void setDatabaseName(String s) {
		databaseName = s.trim();
	}

	public void setSQL(String SQL) {
		this.SQL = SQL.trim();
	}

	public void outQueryResult() {
		Connection con;
		PreparedStatement sql;   // 预处理语句
		ResultSet rs;
		try {
			String uri = "jdbc:derby:" + databaseName + ";create=true";
			con = DriverManager.getConnection(uri);
			sql = con.prepareStatement(SQL);        // 返回预处理语句
			rs = sql.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();// 结果集的元数据对象
			int columnCount = metaData.getColumnCount(); // 结果集的总列数
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i) + "    |"); // 输出字段名
			}
			System.out.println();
			while (rs.next()) {  // 输出结果集中的记录，即行
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "|");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("请输入正确的表名" + e);
		}
	}
}
