
public class UerMAinCode3
{
 public static boolean isPrime(int number)
{
	int d;
	boolean temp=true;
	for(int i=2;i<=number/2;i++)
	{
		d=number%i;
		if(d==0) 
			temp=false; 
		
	}
	 return temp;
	
}
}
