package Collection;


import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


LinkedList ar1=new LinkedList();
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
//ar1.forEach(System.out::println); // consumer interface ... method 3 for output

ListIterator ltr=ar1.listIterator();
System.out.println("Elements in forward dirtection");
while(ltr.hasNext())
{
	System.out.println(ltr.next());}

System.out.println(ar1);
System.out.println("Elements in backword dirtection");

while(ltr.hasPrevious())
System.out.println(ltr.previous());
	
}
}