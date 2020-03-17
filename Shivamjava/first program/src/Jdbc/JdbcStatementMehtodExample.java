package Jdbc;
import java.sql.*;
public class JdbcStatementMehtodExample {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.
getConnection("jdbc:mysql://localhost:3306/shivam","root","root");

Statement statement=connection.createStatement();
//String querry="insert into dept values" + "(50,'JBDC','palmet')";
  //String querry="insert into dept(deptno,name) values (60,'Noname')";
// for nserting records in particular columns
String querry= "update dept set deptno=88 where deptno=50";
//String querry="delete from dept where deptno=10";

int count=statement.executeUpdate(querry);
//System.out.println(count+ "recod inserted");

System.out.println(count+ "recod updated");

/*String querry="insert into dept values" + "(99,'flag','rs')";
boolean flag=statement.execute(querry);
if (flag)
	System.out.println("ResultSet is inseted");
else 
	System.out.println("Record innserted"); */
statement.close();
connection.close();



	
	}}
