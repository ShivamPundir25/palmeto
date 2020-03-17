package ExceptionExamplesAssessment;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Consumer<String> c=s->System.out.println(s);
 c.accept("Helo");
 c.accept("Shivam Pratasp Singh");
 
 Consumer<Integer> c2=x->{
	 if(x>=20)
			 System.out.println("Greater than 20");
	 else System.out.println("Not greater than 20");
 }
;	
c2.accept(15);
	}

}
