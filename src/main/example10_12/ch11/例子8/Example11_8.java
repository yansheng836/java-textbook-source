package ch11.例子8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Example11_8 {
   public static void main(String[] args) {
      Connection conn = null;
      Statement sta = null;
      try { 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
        //连接数据库student:
        conn=DriverManager.getConnection("jdbc:derby:student;create=true");
        sta = conn.createStatement();
      }
      catch(Exception e) {
        System.out.println(e);  
        return;
      }
      try {
         String s="create table biao(name varchar(40) primary key,score real)";
         sta.executeUpdate(s);//创建表biao
      }
      catch(SQLException e) {
         System.out.println("该表已经存在，不再重新创建！"); 
         //如果需要删除表,可以执行sta.execute("drop table biao");删除曾建立的biao表
      }
      try {
         sta.executeUpdate("insert into biao values('张小三', 90.8)");  //插入记录
         sta.executeUpdate("insert into biao values('李仨', 88.87)");
         sta.executeUpdate("insert into biao values('liuming',78.3)");
         sta.executeUpdate("update biao set name ='刘铭' where name='liuming'");
         ResultSet rs = sta.executeQuery("SELECT * FROM biao "); // 查询表中的记录
         while(rs.next()) {
            String name=rs.getString(1);
            System.out.print(name+"\t");
            float score=rs.getFloat(2);
            System.out.println(score);
         }
         conn.close();
      }
      catch(SQLException e) {
          System.out.println(e);  
      }
  }
} 
