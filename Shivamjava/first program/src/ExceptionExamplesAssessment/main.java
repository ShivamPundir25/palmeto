package ExceptionExamplesAssessment;

import java.util.Scanner;
class UserMainCode
{
static int a;
public static int sumOfSquaresOfEvenDigits(int num)
{
	
	int d,se=0;
while(num!=0)
{
    
 d=num%10;
if(d%2==0)
{ se=(d*d) + se;
}
num=num/10;
}

return a=se;
} 
}
//second class
 
class main
{
public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the nmumber");
int num=sc.nextInt();
UserMainCode asd= new UserMainCode();
int res=asd.sumOfSquaresOfEvenDigits(num);
System.out.println(res);
} 
}