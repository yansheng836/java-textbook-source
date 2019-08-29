package ch11.例子5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class Query {
   String databaseName="";    	//数据库名
    String SQL;        		//SQL语句
   public Query() {
      try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
      }
      catch(Exception e) {
         System.out.print(e);
      }
   }
   public void setDatabaseName(String s) {
      databaseName=s.trim();
   }
   public void setSQL(String SQL) {
      this.SQL=SQL.trim();
   }
   public void outQueryResult() { 
      Connection con;
      Statement sql; 
      ResultSet rs;
      try { 
        String uri="jdbc:derby:"+databaseName+";create=true"; 
        con=DriverManager.getConnection(uri);
        sql=con.createStatement();
        rs=sql.executeQuery(SQL);
        ResultSetMetaData metaData = rs.getMetaData();//结果集的元数据对象
        int columnCount = metaData.getColumnCount(); //结果集的总列数 
        for(int i=1;i<=columnCount;i++){
            System.out.print(metaData.getColumnName(i)+"    |"); //输出字段名
        }  
        System.out.println();
        while(rs.next()) {  //输出结果集中的记录，即行
          for(int i=1;i<=columnCount;i++){
             System.out.print(rs.getString(i)+"|");
          }
          System.out.println();  
        }
      }
      catch(SQLException e) {
        System.out.println("请输入正确的表名"+e);
      }
   }    
}
