package JavaBasicsAssessment;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
int i=0,k=0,b=0;
int j=s.length();
while(i>=j)
{
	if(s.charAt(i)!=s.charAt(j))
	{ k++;
		break;
	}
	i--;
	j--;
	}
for(int a=0;a<s.length();a++)
{ if(s.charAt(a)=='a'||s.charAt(a)=='o'||s.charAt(a)=='e'||s.charAt(a)=='i'||s.charAt(a)=='u')
	b++;
	}

if(k==0 && b>=2)
{//System.out.println("Stirng is in palindrome and contains vowels:"+b);
	System.out.println("Valid");
}

else System.out.println("Invalid");	
	}
}
