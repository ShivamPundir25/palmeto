package JavaBasicsAssessment;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
		int dig=num%10;
			
			if(dig%2==0)
				{
					sum=sum+dig*dig;
				}
		int rem=num/10;
			num=rem;
		}
		System.out.println(sum);
	}

}
