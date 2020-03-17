package JavaAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList colarray=new ArrayList();
		colarray.add("Blue");
		colarray.add("Orange");
		colarray.add("Green");
		colarray.add("Red");
		colarray.add("White");
		colarray.add("Black");
	
		//colarray.forEach(System.out::println);
        //fro each loop
		Iterator i=colarray.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
	}

}
