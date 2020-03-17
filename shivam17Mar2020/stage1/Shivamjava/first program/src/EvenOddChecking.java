import java.util.Scanner;
public class EvenOddChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number ");
int num= sc.nextInt();
ExcpetionOfOddEven eoe=new ExcpetionOfOddEven();

try {
	eoe.evenOdd(num);
}
catch(EvenException e)
{
	System.out.println(e);
	}
catch(OddException e)
{ 
	System.out.println(e);
	}
	}

}
