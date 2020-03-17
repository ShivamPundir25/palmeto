import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UserMain5 {

	public static void main(String[] args) throws SQLException  {
	
try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.
		getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		String querry="insert into employee values(?,?,?,?,?,?)";
		PreparedStatement pst=connection.prepareStatement(querry);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the records.......");
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter department");
		String dept=sc.next();
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter company");
		String company=sc.next();
		System.out.println("enter emailed");
		String emailed=sc.next();
		pst.setString(1,name );
	    pst.setInt(2 ,id);
	    pst.setString(3,dept );
	    pst.setString(4,desg );
	    pst.setString(5,company );
	    pst.setString(6,emailed );
		int x=pst.executeUpdate();
		if(x!=0)
		System.out.println("Records Succesfully inserted");
		else
			System.out.println("Not inserted");
		pst.close();
		connection.close();
}
 catch(Exception e)
{
	System.out.println(e);
	}
finally {
	System.out.println("........");
}
	}
}
