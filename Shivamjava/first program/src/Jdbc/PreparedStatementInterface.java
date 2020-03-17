package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementInterface {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.
getConnection("jdbc:mysql://localhost:3306/shivam","root","root");
String querry="insert into dept values(?,?,?)";
PreparedStatement pst=connection.prepareStatement(querry);
Scanner sc=new Scanner(System.in);
System.out.println("Enter htno");
int id1=sc.nextInt();
System.out.println("Enter cousre");
String id2=sc.next();
System.out.println("Enter place");
String id3=sc.next();
pst.setInt(1, id1);
pst.setString(2, id2);
pst.setString(3, id3);
int x=pst.executeUpdate();
System.out.println(x+"Record insetred");
// close all here 
pst.close();
connection.close();
	}
catch(Exception e)
{
	System.out.println(e);}
}

}


// PreparedStatement is interface and prepareStatment() is method.
// for inserting values in column dynamically
// make generic data type (?,?,?,?) columnmns