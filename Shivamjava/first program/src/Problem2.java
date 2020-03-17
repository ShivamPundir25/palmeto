import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the value of a");
int a=s.nextInt();
System.out.println("Enter the value of b");
int b=s.nextInt();
System.out.println("Enter the value of c");
int c=s.nextInt();
int sum=0;
if(a==13)
{
	System.out.println("sum=" +c);
}
else if (b==13)
{
		System.out.println("sum=" +a);
	}
	else if (c==13)
	{
		System.out.println("sum=" +(a+b));
	}
	else 
		System.out.println("sum=" +(a+b+c));
}
}