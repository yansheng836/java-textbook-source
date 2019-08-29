package ch11.例子7;

public class Example11_7 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("shop");
     String SQL = "SELECT * FROM goods WHERE name LIKE '%教程%'";
     query.setSQL(SQL);
     query.outQueryResult();
   }
}
