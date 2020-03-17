
package ExceptionExamplesAssessment;
import java.util.function.Predicate;
public class StringPredicateExample {

	public static void main(String[] args) {

// TODO Auto-generated method stub
String[] names= {"Sunny","Kahn","Kamles","Karan","Mreah"};
		Predicate<String> s=str->(str.charAt(0)=='K');
		for(String n:names)
		{
			if(s.test(n))
			{
				System.out.println(n);
			}
		}
 System.out.println(s.test("Kamlesh"));
 System.out.println(s.test("samlesh"));
	}

}
