import java.util.Scanner;

public class KasprurNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int s=(a*a);
System.out.println(s);
int s1=0,s2=0;
int b=a;
while(b!=0)
{
	b=a%10;
s1=b+s1;
b=b/10;
	}
while(s!=0)
{
	s=s%10;
	s2=s2+s;
	s=s/10;
	
	}
if(s1==s2)
	System.out.println("Its a kaspur number");
else System.out.println("INVALID");
	}

}
/// wrong code
