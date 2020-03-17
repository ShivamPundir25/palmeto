import java.util.Scanner;
public class Problem3 
{
	
	public static void main(String[] args) 
{
		String s2;
		String s3;
		String s4;
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String s1=s.next();
char ch0=s1.charAt(0);
char ch1=s1.charAt(1);
if((ch0=='j'||ch0=='J')&&(ch1=='b'||ch1=='B'))
{ System.out.println("Updated string is:" +s1);}


else if((ch0=='j'||ch0=='J'))
{
	s4=s1.substring(0,1);
	s3=s1.substring(2);
	System.out.println("Updated string is:" +s4+s3);
}
	
	else if((ch1=='b'||ch1=='B'))
{
	s4=s1.substring(1,2);
	s3=s1.substring(2);
		
	System.out.println("Updated string is:" +s4+s3);
}

else if ((ch0!='j'||ch0!='J')&&(ch1!='b'||ch1!='B'))
{ s2=s1.substring(2);  System.out.println("Updated string is:" +s2);
}
  }
}