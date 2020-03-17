import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.next();

int result=UserMainCode.checkUnique( s);
System.out.println(result);
	}

}
