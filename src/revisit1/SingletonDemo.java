package revisit1;

public class SingletonDemo {
	public static void main(String[] args) {
		
		
		System.out.println(DBConnection.j);
		
//		for(int i = 1; i <= 10 ; i++) {
			DBConnection.getObject();
			DBConnection dbconnect = DBConnection.getObject();
			System.out.println(dbconnect);
			DBConnection dbconnect1 = DBConnection.getObject();
			System.out.println(dbconnect1);
			DBConnection dbconnect2 = DBConnection.getObject();
			System.out.println(dbconnect2);
			
//		}
		
		// Singleton - single object across entire framework
		//1 - make your constructor private
		//2 - create static method in order to access static object variable
		//3 - add one if condition with null criteria 
	}
}


class DBConnection{
	
	private static DBConnection connection = null;
	int i;
	static int j;
	
	private DBConnection() {
		
	}

	public void executeQuery() {
		System.out.println("i am executing query");
	}
	
	public static DBConnection getObject() {
		if(connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}

}