package ch11.����7;

public class Example11_7 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("shop");
     String SQL = "SELECT * FROM goods WHERE name LIKE '%�̳�%'";
     query.setSQL(SQL);
     query.outQueryResult();
   }
}
