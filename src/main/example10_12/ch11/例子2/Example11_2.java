package ch11.例子2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
public class Example11_2 {
   public static void main(String args[]) {
      Connection con;
      Statement sql; 
      ResultSet rs;
      try{ Class.forName("org.apache.derby.jdbc.ClientDriver");
      }
      catch(Exception e) {
         System.out.print(e);
      }
      try { 
          String uri="jdbc:derby://127.0.0.1:1527//student;create=true";
          con=DriverManager.getConnection(uri);//和网络Derby数据库student建立连接
          sql=con.createStatement();
          rs=sql.executeQuery("SELECT * FROM mingdan");
          while(rs.next()) {
              String number=rs.getString(1);
              String name=rs.getString(2);
              System.out.print(number+"|");
              System.out.println(name+"|");
          }
          con.close();
      }
      catch(SQLException e) { 
          System.out.println(e);
      }
   }
}
