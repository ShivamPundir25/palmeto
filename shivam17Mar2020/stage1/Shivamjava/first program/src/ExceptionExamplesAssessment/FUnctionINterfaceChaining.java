package ExceptionExamplesAssessment;
import java.util.function.Function;
public class FUnctionINterfaceChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,String> f1=s->s.toUpperCase();
Function<String,String> f2=s->s.substring(0,8);
 System.out.println( f1.apply("Shivam Pratap Singh"));
 System.out.println(f2.apply("Shivam Pratap Singh"));

	System.out.println(f1.andThen(f2).apply("Shivam Pratap Singh"));
	System.out.println(f2.compose(f1).apply("Shivam Pratap Singh"));
	}

}
