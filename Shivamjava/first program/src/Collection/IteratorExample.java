package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ArrayList ar1=new ArrayList();
ar1.add("Sam");
ar1.add("tap");
ar1.add("Singh");
ar1.add("pun");
System.out.println(ar1);
Iterator itr=ar1.iterator();
//System.out.println(itr.next());
//System.out.println(itr.next());
//method 1 for output
/*while(itr.hasNext())
	System.out.println(itr.next());
	}

}*/ 
//mehtod 2 for output
ar1.forEach(System.out::println); // consumer interface ... method 3 for output
}}