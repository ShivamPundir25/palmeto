package JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList colarray=new ArrayList();
		colarray.add("Blue");
		colarray.add("Orange");
		colarray.add("Green");
		colarray.add("Red");
		colarray.add("White");
		colarray.add("Black");
		System.out.println(colarray);
		// updating the color at index
		colarray.set(0,"Purple");
		System.out.println(colarray);
		
		//problem 6
		colarray.remove(4);
		System.out.println(colarray);
		//problem 7
		if(colarray.contains("Red"))
			System.out.println("it contains the element");
		else System.out.println("does not contain the element");
		//problem 8
		System.out.println("Sorted elements");
		Collections.sort(colarray);
		System.out.println(colarray);
		System.out.println("Sub List");
		//problem 9
		System.out.println(colarray.subList(0,2));
	
	}

}
