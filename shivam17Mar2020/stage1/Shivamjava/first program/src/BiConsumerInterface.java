import java.util.function.*;
import java.util.ArrayList;
public class BiConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*BiConsumer<String,String> bic=(a,b)->System.out.println(a+b);
bic.accept("hi","shivam"); */
		ArrayList<Emp> list= new ArrayList<Emp>();
		list.add(new Emp("Durga",1000));
		list.add(new Emp("Sunny",2000));
		list.add(new Emp("Bunny",3000));
		list.add(new Emp("Chinny",4000));
		BiConsumer<Emp,Double> bic=(c,d)->c.sal=c.sal+d;
		for(Emp c:list)
			bic.accept(c,500.0);
		for(Emp c:list)
		{
			System.out.println("Emppoyee name" +c.name);
			System.out.println("Emppoyee name" +c.sal);
			System.out.println();
		}
	}

}

class Emp{
	String name;
	double sal;
	public Emp(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
}
