package Jdbc;
import java.util.*;
import java.sql.*;
import java.io.*;
public class RBFConcept {

	public static void main(String[] args) {
    // TODO Auto-generated method stub

		try{ 
			FileInputStream fis=new FileInputStream("D:\\Shivamjava\\first program\\bin\\Jdbc\\ctsdb.properties");
			Properties p=new Properties();
			p.load(fis);
			String dname=(String) p.get("Dname");
			String url=(String) p.get("URL");
			String username=(String) p.get("Uname");
			String password=(String) p.get("Pwd");
			//String tablename=(String) p.get("Tablename");
			//loading drivers and obtaining connection
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the table name");
			String tablename=sc.next();
			
			Class.forName(dname);
			System.out.println("Driver loading......");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Created");
			
			// executing query
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from "+tablename);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			//printing column names
			System.out.println("=====================");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName (i)+"  ");
			}
			System.out.println("");
			System.out.println("==============================");
			//printing the data
			while(rs.next())
			{for(int j=1;j<rsmd.getColumnCount();j++)
			{
				System.out.println(rs.getString(j)+" ");
				
			}
				System.out.println(" ");
			}
			con.close();
			
	}
catch(Exception e)
{System.out.println(e);}
		}}
