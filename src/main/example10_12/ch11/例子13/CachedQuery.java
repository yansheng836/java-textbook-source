package ch11.����13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.rowset.CachedRowSetImpl;

public class CachedQuery {
	String databaseName = "";  			// ���ݿ���
	String SQL;                        		// SQL���
	CachedRowSetImpl rowSet;        		// ��������

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
			ResultSetMetaData metaData = rs.getMetaData();// �������Ԫ���ݶ���
			int columnCount = metaData.getColumnCount(); // �������������
			rowSet = new CachedRowSetImpl();
			rowSet.populate(rs);
			con.close();              		// ���ھͿ��Թر�������
			while (rowSet.next()) {
				for (int k = 1; k <= columnCount; k++) {
					System.out.print(" " + rowSet.getString(k) + " ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			System.out.println("��������ȷ�ı���" + e);
		}
	}
}
