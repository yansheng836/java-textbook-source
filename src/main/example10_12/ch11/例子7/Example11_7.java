package ch11.Àý×Ó7;

public class Example11_7 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("shop");
     String SQL = "SELECT * FROM goods WHERE name LIKE '%½Ì³Ì%'";
     query.setSQL(SQL);
     query.outQueryResult();
   }
}
