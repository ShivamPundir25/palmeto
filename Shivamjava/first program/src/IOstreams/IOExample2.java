package IOstreams;
import java.io.*;
import java.util.*;

public class IOExample2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
try(InputStreamReader cin=new InputStreamReader(System.in);
		FileOutputStream out=new FileOutputStream("D:\\Shivamjava\\first program\\bin\\IOstreams\\resultdata.txt");){
	// try with resources .. if we provide something in try resource() then it will get automaticlly close
	System.out.println("Enter the character, q to quit");
	char c;
	do {
		c=(char) cin.read();
		out.write(c);
	}

while(c!='q');}
	}

}
