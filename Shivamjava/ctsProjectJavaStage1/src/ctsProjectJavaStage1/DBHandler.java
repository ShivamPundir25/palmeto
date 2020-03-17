package ctsProjectJavaStage1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
public Connection establishConnection() throws IOException, SQLException
	

	{ 
	Connection con=null;
	FileInputStream fis=new FileInputStream("D:\\Shivamjava\\ctsProjectJavaStage1\\db.properties");
	Properties properties=new Properties();
	properties.load(fis);
	try {
    String driver=(String )properties.get("driver");
	String url=(String)properties.get("url");
	String password=(String)properties.get("password");
	String user=(String)properties.get("user");
	Class.forName(driver);
	con=DriverManager.getConnection(url,user,password);
	
	if(con!=null)
	    {
		System.out.println("Established");
		}
	else 
		System.out.println("NOt Estsblsihed");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	return con;
}
}
