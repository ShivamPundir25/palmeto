package ExceptionExamplesAssessment;
import java.util.function.Supplier;
public class SuplierTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<String> test=()->{
	String[] s1= {"shivam","surya","pratp","singh","hari"};
	int x=(int)(Math.random()*5);
	return s1[x];
};
System.out.println(test.get());
System.out.println(test.get());
System.out.println(test.get());
System.out.println(test.get());

	}

}
