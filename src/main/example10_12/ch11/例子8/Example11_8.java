package ch11.����8;

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
        //�������ݿ�student:
        conn=DriverManager.getConnection("jdbc:derby:student;create=true");
        sta = conn.createStatement();
      }
      catch(Exception e) {
        System.out.println(e);  
        return;
      }
      try {
         String s="create table biao(name varchar(40) primary key,score real)";
         sta.executeUpdate(s);//������biao
      }
      catch(SQLException e) {
         System.out.println("�ñ��Ѿ����ڣ��������´�����"); 
         //�����Ҫɾ����,����ִ��sta.execute("drop table biao");ɾ����������biao��
      }
      try {
         sta.executeUpdate("insert into biao values('��С��', 90.8)");  //�����¼
         sta.executeUpdate("insert into biao values('����', 88.87)");
         sta.executeUpdate("insert into biao values('liuming',78.3)");
         sta.executeUpdate("update biao set name ='����' where name='liuming'");
         ResultSet rs = sta.executeQuery("SELECT * FROM biao "); // ��ѯ���еļ�¼
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
