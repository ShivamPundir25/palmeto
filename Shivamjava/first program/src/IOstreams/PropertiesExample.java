package IOstreams;
import java.io.*;
import java.util.Set;
import java.util.Properties;
public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop=new Properties();
FileReader fout=new FileReader("D:\\Shivamjava\\first program\\bin\\IOstreams\\DB.properties");
prop.load(fout);
System.out.println(prop.getProperty("uname"));
System.out.println(prop.getProperty("pwd"));
Set s=prop.stringPropertyNames();
System.out.println(s);
fout.close();
	}

}
