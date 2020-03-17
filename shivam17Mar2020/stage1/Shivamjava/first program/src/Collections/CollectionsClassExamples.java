package Collections;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionsClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ArrayList arnew=new ArrayList();
arnew.add("");
arnew.add("");
arnew.add("");
arnew.add("");
ar.add("Java");
ar.add("Surya");
ar.add("Sdhivam");
ar.add("hari");
ar.forEach(System.out::println);
System.out.println("ELements in orgibnial order");
System.out.println(ar);
System.out.println("ArrayList in reverse order");
Collections.reverse(ar);
System.out.println(ar);
System.out.println("ArrayList in sorted order");
Collections.sort(ar);
System.out.println(ar);
System.out.println("ArrayList in descending order");
Collections.reverse(ar);
System.out.println(ar);
System.out.println("copy order");
Collections.copy(arnew,ar);
System.out.println(arnew);

System.out.println("CheckedCollection mehtod");
Collections.checkedCollection(ar,String.class);

}

}
