
/* 1. Write a program to read a string and validate PAN no.
 *  against following

rules: (15 Marks)

1. There must be eight characters.

2. First three letters must be alphabets followed by four digit number

and ends with alphabet

3. All alphabets should be in capital case.*/

	import java.util.Scanner;
	class User {
		public static int validatePAN(String pan)
		{
			int r=0;
			if(pan.length()==10)
			{
				if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
					r=1;
				else
					r=2;
			}
			return r;
		}
	}
	public class PanVerification
	{
		public static void main(String[] args)
		{
			System.out.println("Enter your PAN Number");
			Scanner sc = new Scanner(System.in);
			String pan=sc.next();
			int r=User.validatePAN(pan);
			if(r==1)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}

	}


