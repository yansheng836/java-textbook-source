package ch11.����6;

public class Example11_6 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("D:/2000/shop");
     String SQL= "SELECT * FROM goods ORDER BY price";
     query.setSQL(SQL);
     System.out.println("goods���۸�����:");
     query.outQueryResult();
   }
}
