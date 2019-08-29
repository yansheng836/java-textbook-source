package ch11.例子9;

public class Example11_9 {
	public static void main(String args[]) {
		PrepareQuery query = new PrepareQuery();
		String database = "shop";
		query.setDatabaseName(database);
		query.setSQL("SELECT * FROM goods");
		query.outQueryResult();
	}
}
