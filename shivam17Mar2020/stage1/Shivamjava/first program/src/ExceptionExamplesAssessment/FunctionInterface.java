package ExceptionExamplesAssessment;
import java.util.function.Function;
public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> f1= s->s.length();
System.out.println("The length of string india is :" +f1.apply("India"));
 Function<Integer,Integer> f2=n->n*n;
 System.out.println("The square of 4 is :" +f2.apply(4));

 Function<Integer,Integer> fact=x->
 {
	 int f=1;
	 for(int i=2;i<=x;i++)
	 {
		 f=f*i;
		
	 } return f;
 }; 
 System.out.println("Factorial of  4 is:" +fact.apply(4));
	}

}
