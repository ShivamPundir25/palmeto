package StreamsExample;
import java.util.*;
import java.util.stream.Stream;
public class SearchMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<Integer> list=Arrays.asList(13,5,7,9,11);// withput using add method
Stream s=Stream.of(135,7,9,11);
//Optional<Integer> answer=list.stream().findAny();
Optional<Integer> answer1=s.findAny();
/*if(answer.isPresent())
{
	System.out.println(answer.get());}
else System.out.println("no value");;*/
if(answer1.isPresent())
{
	System.out.println(answer1.get());}
else System.out.println("no value");


System.out.println(s);
	}

}
