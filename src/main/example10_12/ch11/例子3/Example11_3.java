package ch11.����3;

public class Example11_3 {
   public static void main(String args[]) {
     Query query=new Query();
     query.setDatabaseName("D:/2000/shop");
     query.setSQL("SELECT * FROM goods");
     query.outQueryResult();
   }
}
