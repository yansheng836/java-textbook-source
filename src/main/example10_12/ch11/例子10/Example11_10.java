package ch11.例子10;

public class Example11_10 {
   public static void main(String args[]) {
     AddRecord insertRecord=new AddRecord();
     String database="shop";
     String tableName="goods";
     insertRecord.setDatabaseName(database);
     insertRecord.setTableName(tableName);
     insertRecord.setNumber("D001");
     insertRecord.setName("联想电脑");
     insertRecord.setMadeTime("2015-12-10");
     insertRecord.setPrice(5600);
     String backMess=insertRecord.addRecord();
     System.out.println(backMess);
   }
}
