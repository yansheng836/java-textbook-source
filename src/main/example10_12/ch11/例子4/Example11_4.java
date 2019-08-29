package ch11.例子4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
public class Example11_4 {
   public static void main(String args[]) {
      Connection con;
      Statement sql; 
      ResultSet rs;
      try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
      }
      catch(Exception e) {
         System.out.print(e);
      }
      try { 
          con=DriverManager.getConnection("jdbc:derby:shop;create=true");
          sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                       ResultSet.CONCUR_READ_ONLY);
          rs=sql.executeQuery("SELECT * FROM goods ");
          rs.last();
          int rows = rs.getRow();
          System.out.println("goods表共有"+rows+"条记录");
          rs.afterLast();
          System.out.println("倒序输出goods表中的记录:");
          while(rs.previous()) {
             System.out.print(rs.getString(1)+"|");
             System.out.print(rs.getString(2)+"|");
             System.out.print(rs.getDate(3)+"|"); 
             System.out.println(rs.getDouble(4)+"|");
          }
          con.close();
      }
      catch(SQLException e) { 
         System.out.println(e);
      }
  }
}
