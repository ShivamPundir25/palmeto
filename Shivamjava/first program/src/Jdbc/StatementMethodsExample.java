package Jdbc;
import java.sql.*;

public class StatementMethodsExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// creating table
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.
		getConnection("jdbc:mysql://localhost:3306/shivam","root","root");

		Statement statement=connection.createStatement();
	
	String querry="CREATE TABLE jdbctest(eno INT(5),ename VARCHAR(10));";
	int c=statement.executeUpdate(querry);
	System.out.println("TAble created");
	statement.close();
	connection.close();
	}
}
