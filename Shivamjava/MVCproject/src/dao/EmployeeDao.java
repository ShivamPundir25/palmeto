package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.MvcEmployee;
public class EmployeeDao {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/employee","root","root");
		
		
		return con;
	}
	
	public void insertEmployee(MvcEmployee emp)
	{
		
	}
	
	public List<MvcEmployee> showEmployees()
	{
		
		List<MvcEmployee> list=new ArrayList<MvcEmployee>();
		try {
			Connection con=getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from MvcEmployee");
			while(rs.next())
			{
			MvcEmployee u=new MvcEmployee();
			u.setDept(rs.getString(3));
			//here the setters method are setting the values
			
			u.setDesg(rs.getString(4));
			u.setEmail(rs.getString(5));
			u.setEmpid(rs.getInt(1));
			u.setEname(rs.getString(2));
			list.add(u);
			
			}
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		return list;
		}
	
}
