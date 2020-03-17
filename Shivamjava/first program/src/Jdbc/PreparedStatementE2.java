package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Connection connection=DriverManager.
	getConnection("jdbc:mysql://localhost:3306/shivam","root","root");
	String querry="select * from dept where deptno=?";
	PreparedStatement pst=connection.prepareStatement(querry);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter htno");
	int id=sc.nextInt();
	
	pst.setInt(1, id);
	ResultSet rs=pst.executeQuery();
	if(rs.next())
	{
		System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getString(3));
	}
	else System.out.println("No row is sleected");
		
		pst.close();
		connection.close();
		}
	catch(Exception e)
	{
		System.out.println(e);}
	}
	}


