package JavaAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sacneer object
	
		
		ArrayList colarray=new ArrayList();
		colarray.add("Blue");
		colarray.add("Orange");
		colarray.add("Green");
		colarray.add("Red");
		colarray.add("White");
		colarray.add("Black");
	
		System.out.println(colarray);
		Iterator i=colarray.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index u wanna access:");
		int index=sc.nextInt();
		System.out.println(colarray.get(index));

	}

}
