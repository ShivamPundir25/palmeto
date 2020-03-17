import java.util.Scanner;
public class Problem4 
{

	public static void main(String[] args)
	{
		
		SubClass sc=new SubClass();
Scanner obj= new Scanner(System.in);
System.out.println("Enter the number:");
int num=obj.nextInt();

if(num>=0)
{
SubClass asd=new SubClass();
int data=asd.fSum(num);	
System.out.println(data);
}
else
	System.out.println("Enter the + no.");


	}
	}
	

	
class SubClass
{ 
public int fSum(int num)
	{
	    int s=0;
        int r=0;
		int n=num;
		int d;
		while(n!=0)
		{
		r=n%10;
		d=n/10;
		s=s+r;
		n=d;
		}
		if(s<=9)
		return s;
		else return fSum(s);
	}
}