package ExceptionExamplesAssessment;
import java.util.function.Function;
public class FunctionalInterfaceeXAMPLE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> nv=s->
{ int c=0;
	for(int i=0;i<s.length();i++)
	{
		if (s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='e'||s.charAt(i)=='o')
		{
			c=c+1;
		} 
	}return c;
	}; System.out.println("The number of vowles is "+nv.apply("Shivam"));
	Function<String,Integer> nc=s->
	{ int c=0;
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{c=c+1;}	
	}
	 int sl=s.length()-c;
		return sl ;
	};
	System.out.println(nc.apply("Shivam Pratap Singh"));
	}

	
}
