package ExceptionExamplesAssessment;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
int[] a= {10,34,5,6,6};
ar.add("Shivam");
ar.add("pratap");
ar.add("Singh");
ar.add("pundir");
ar.add("");
ar.add("f");
System.out.println(ar);

ArrayList ar1=new ArrayList();
ar1.add("Sam");
ar1.add("tap");
ar1.add("Singh");
ar1.add("pun");
//ar.add(ar1);
//System.out.println(ar);
ar.addAll(ar1);
System.out.println(ar);
if(ar.contains(ar1))
{
	System.out.println("Found");}
else System.out.println("Not Found");
	}

}
