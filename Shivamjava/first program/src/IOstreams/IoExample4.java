package IOstreams;
import java.util.*;
import java.io.*;
public class IoExample4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
try(InputStreamReader ipr =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ipr);		)
{
	System.out.println("Enter the 1st marks");
	int m1=Integer.parseInt(br.readLine());
	// parse string into int using parseint
	System.out.println("Enter the 2nd marks");
	int m2=Integer.parseInt(br.readLine());
	
	System.out.println("Enter the 3rd marks");
	int m3=Integer.parseInt(br.readLine());
	 int total=m1+m2+m3;
	System.out.println(total);
	
	}
	}

}
