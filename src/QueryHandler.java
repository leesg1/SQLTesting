import java.sql.*;



public class QueryHandler {

	/**
	 * @param args
	 */
	static Connection myConn = null;
	static Statement myStmt = null;
	static ResultSet myRs = null;
	
	
	public static void main(String[] args) {

		try {
			// 1. Get a connection to database
		//	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "student" , "student");
			
		//	System.out.println("Database connection successful!\n");
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			// 4. insert into database
			myRs = myStmt.executeQuery("select * from employees");

			
			// 4. Process the result set
			while (myRs.next()) {
		//		System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
	// initialise the connection with the database
	public static void initialise(){
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "student" , "student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printTable(){
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from employees");
			System.out.println("The employee table\n");
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name") + ", " + myRs.getString("last_name") 
						+ ", " +  myRs.getString("email") + ", " +  myRs.getString("department") + ", " + myRs.getString("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean insertEmployee(String entry){
		try {
			System.out.println("\nExecuting query: "  + entry);
			myStmt = myConn.createStatement();
			int rowsAffected = myStmt.executeUpdate(entry);
			
//			while (myRs.next()) {
//				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
