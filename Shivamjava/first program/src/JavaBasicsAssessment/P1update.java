package JavaBasicsAssessment;import java.util.Scanner;

public class P1update {
	static int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	
		int z=0,k=0;
		int a=0,e=0,i=0,o=0,u=0;
		int j=s.length();
		while(z>=j)
		{
			if(s.charAt(z)!=s.charAt(j))
			{ k++;
				break;
			}
			i--;
			j--;
			}
		for(int loop=0;loop<s.length();loop++)
		{ if(s.charAt(loop)=='a')
		{a++;}
		else if(s.charAt(loop)=='o')
		{o++;}
		else if(s.charAt(loop)=='e')
		{e++;}
		else if(s.charAt(loop)=='i')
		{i++;}
		else if(s.charAt(loop)=='u')
		{u++;}
		
			}
		if(a>=1)
		b++; 
		if(e>=1) b++; 
		if(i>=1) b++; 
		if(o>=1)b++; 
		if(u>=1) b++;
		

		if(k==0 && b>=2)
		{//System.out.println("Stirng is in palindrome and contains vowels:"+b);
			System.out.println("Valid");
		}

		else System.out.println("Invalid");	
	}

}
