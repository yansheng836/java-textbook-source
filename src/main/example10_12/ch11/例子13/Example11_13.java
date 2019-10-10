package ch11.Р§зг13;

public class Example11_13 {
   public static void main(String args[]) {
     CachedQuery query=new CachedQuery();
     query.setDatabaseName("shop");
     query.setSQL("SELECT * FROM goods");
     query.outQueryResult();
   }
}
