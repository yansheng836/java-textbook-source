package ch11.�ϻ�ʵ��ģ�����.ʵ��1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class E {
	public static void main(String args[]) {
	      try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	      }
	      catch(ClassNotFoundException e) {
	         System.out.print(e);
	      } 
	      Connection con=null;
	      Statement sta = null;
	      PreparedStatement sql=null;   //Ԥ�������
	      try {
//	        con =������1��//���ӵ����ݿ�employee
	        sta = con.createStatement(); 
	        String s="create table salary(number int primary key not null,money double)";
	        sta.execute(s);//������salary,������Ѵ��ڣ��������´�����������SQLException
	        sql=con.prepareStatement("INSERT INTO salary VALUES (?,?)");
	      }
	      catch(SQLException exp){
	      }
	      finally{
	        try {
	            sql=con.prepareStatement("INSERT INTO salary VALUES (?,?)");
	        }
	        catch(SQLException ee){} 
	      }
	      int number=0;
	      double money =0;
	      Scanner scanner = new Scanner(System.in);
	      int condition=1;
	      while(condition==1) {
	          System.out.print("���빤�ʺţ���������"); 
	          number = scanner.nextInt(); 
	          System.out.print("���빤�ʣ�����������"); 
	          money = scanner.nextDouble(); 
	          try {
	           sql.setInt(1,number);
	           sql.setDouble(2,money);
	           sql.execute();
	          }
	          catch(Exception ex){
	              System.out.print("��Ӽ�¼ʧ�ܣ�"+ex);
	          }
	          System.out.print("����1��������1����");
	          condition = scanner.nextInt();
	      }
	   }
}
