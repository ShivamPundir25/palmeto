package JavaBasicsAssessment;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String s2;
		if(n<=s.length()/2)
		{
			s2=s.substring(0,n)+s.substring(s.length()-n);
			System.out.println(s2);
		}
		else System.out.println("Invalid");
	}

}
