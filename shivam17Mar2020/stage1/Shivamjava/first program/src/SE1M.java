import java.util.Scanner;
public class SE1M {
static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the  digit");
int num=sc.nextInt();
Sem1 umc=new  Sem1();
if(num>0)
{
	 a=umc.checkSum(num);
	if(a==1)
	{
		System.out.println("Sum is odd");
	}
	else System.out.println("Sum is even");
	}
else
	System.out.println("Enter a positive number");
	}

}
