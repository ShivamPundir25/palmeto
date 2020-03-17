package ExceptionExamplesAssessment;
import java.util.function.Predicate;
public class PredicateJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {0,5,10,15,20,25,30};
 Predicate<Integer> p1=i -> i>10;
 Predicate<Integer> p2=i -> i%2==0;
 System.out.println("The number greater than 10:");
 method1(p1,x);
 System.out.println("even numbers:");
 method1(p2,x);
 System.out.println("number not greater than 10:");
 method1(p1.negate(),x);
 System.out.println("The number greater than 10 and even");
 method1(p1.and(p2),x);
 System.out.println("The number greater than 10 or even");
 method1(p1.or(p2),x);
 
	}

	public static void method1(Predicate<Integer>p,int[] x) {
		for(int y :x)
		{if(p.test(y))
		{
			System.out.println(y);
		}
			
		}
	}
}
