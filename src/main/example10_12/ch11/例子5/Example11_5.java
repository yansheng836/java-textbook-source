package ch11.����5;

public class Example11_5 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("D:/2000/shop");
     String number = "003";
     String SQL = "SELECT * FROM goods WHERE number ='"+number+"'";
     query.setSQL(SQL);
     System.out.println("goods������Ʒ����"+number+"�ļ�¼");
     query.outQueryResult();
     double max = 4800,min=2800;
     SQL= "SELECT * FROM goods WHERE price >="+min+" AND price <="+max;
     query.setSQL(SQL);
     System.out.println("goods���м۸���"+min+"��"+max+"֮��ļ�¼:");
     query.outQueryResult();
   }
}
