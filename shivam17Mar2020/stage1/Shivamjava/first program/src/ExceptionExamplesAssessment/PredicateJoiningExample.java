package ExceptionExamplesAssessment;
import java.util.function.Predicate;
public class PredicateJoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> p1= i->(i>20);
Predicate<Integer> p2= i->(i%2==0);
//System.out.println(p1.test(7));
//System.out.println(p2.test(20));

System.out.println(p1.and(p2).test(30));
System.out.println(p1.and(p2).test(12));

System.out.println(p1.or(p2).test(12));

System.out.println(p1.negate().test(30)); 
System.out.println((p2.negate().test(11)));
	}

}
