package ch11.����9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PrepareQuery {
	String databaseName = "";    	// ���ݿ���
	String tableName = "";        	// ����
	String SQL;                	// SQL���

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
		PreparedStatement sql;   // Ԥ�������
		ResultSet rs;
		try {
			String uri = "jdbc:derby:" + databaseName + ";create=true";
			con = DriverManager.getConnection(uri);
			sql = con.prepareStatement(SQL);        // ����Ԥ�������
			rs = sql.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();// �������Ԫ���ݶ���
			int columnCount = metaData.getColumnCount(); // �������������
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i) + "    |"); // ����ֶ���
			}
			System.out.println();
			while (rs.next()) {  // ���������еļ�¼������
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "|");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("��������ȷ�ı���" + e);
		}
	}
}
