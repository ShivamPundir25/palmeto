import java.util.Scanner;
public class SumDigit {
	public static int sum(int num)
	{
		int s=0;
		int r=0;
		while(num!=0)
		{
			r=num%10;
			s+=r;
			num=num/10;
		}
		if(s<=9)
			return s;
		else return sum(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int res=sum(n);
System.out.println(res);
	}

}
