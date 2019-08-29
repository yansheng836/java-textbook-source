package ch11.例子13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.rowset.CachedRowSetImpl;

public class CachedQuery {
	String databaseName = "";  			// 数据库名
	String SQL;                        		// SQL语句
	CachedRowSetImpl rowSet;        		// 缓冲结果集

	public CachedQuery() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
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
		Statement sql;
		ResultSet rs = null;
		try {
			String uri = "jdbc:derby:" + databaseName + ";create = true";
			con = DriverManager.getConnection(uri);
			sql = con.createStatement();
			rs = sql.executeQuery(SQL);
			ResultSetMetaData metaData = rs.getMetaData();// 结果集的元数据对象
			int columnCount = metaData.getColumnCount(); // 结果集的总列数
			rowSet = new CachedRowSetImpl();
			rowSet.populate(rs);
			con.close();              		// 现在就可以关闭连接了
			while (rowSet.next()) {
				for (int k = 1; k <= columnCount; k++) {
					System.out.print(" " + rowSet.getString(k) + " ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			System.out.println("请输入正确的表名" + e);
		}
	}
}
