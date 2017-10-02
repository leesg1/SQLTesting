import java.sql.*;
import java.io.*;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryHandler qHanlder = new QueryHandler();
	//	System.out.println("got here");
		String entry = "insert into employees " + " (last_name, first_name, email, department, salary) " +
				"values " + "('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)";
		qHanlder.initialise();
		qHanlder.printTable();
		
		//qHanlder.insertEmployee(entry);
		qHanlder.printTable();

		
	}
	
}
