package problem1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter first String");
String s1=sc.next();
System.out.println("Enter second String");
String s2=sc.next();

int r=UserMainCode.compareDashes(s1,s2);
if(r==1)
	System.out.println("Yes");
else if(r==2) System.out.println("No");
	}

}

