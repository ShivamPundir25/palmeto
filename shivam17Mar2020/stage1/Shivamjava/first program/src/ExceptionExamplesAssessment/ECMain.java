
package ExceptionExamplesAssessment;
import java.util.Scanner;

public class ECMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
ExcpetionCondition1 obj=new ExcpetionCondition1();
try
{
	obj.Eaf(num);
	}
catch(Exception1Method2 e)
{
	System.out.println(e);
	}
catch(Exception1Method e)
{
	System.out.println(e);
	}
	}

}
