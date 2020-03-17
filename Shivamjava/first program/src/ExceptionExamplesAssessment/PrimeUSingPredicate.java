package ExceptionExamplesAssessment;
import java.util.function.Predicate;
public class PrimeUSingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Predicate <Integer> prime=i->{
	 boolean flag=true;
	 for(int x=2;x<i;x++)
	 {
		 if(x%i==0)
				 {
			 flag=false;
			 break;
				 }
	 }
	 return flag;
 };
 System.out.println(prime.test(45));
	}

	
}
