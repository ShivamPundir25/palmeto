import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class MainCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar1=new ArrayList<Integer>();
ArrayList<Integer> ar2=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of arraylist");
int size=sc.nextInt();
System.out.println("Enter elements in arraylist 1");
for(int i=0;i<size;i++)
{
	ar1.add(sc.nextInt());
	}
System.out.println("Enter elements in arraylist 2");
for(int i=0;i<size;i++)
{
	ar2.add(sc.nextInt());
	}
System.out.println("Enter operation u want to perform among +,-,*");
String c=sc.next();
char ch=c.charAt(0);
System.out.println(ch);
	
	List l1=performSetOperations(ar1,ar2,ch);
System.out.println(l1);
	
}

	private static ArrayList performSetOperations(ArrayList<Integer> ar1, ArrayList<Integer> ar2, char ch) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		Set set = new HashSet();
		switch(ch) {
		case '-': 
			for (int i = 0; i < ar1.size(); i++) {
		       int k = 0;
		        for (int j = 0; j < ar2.size(); j++) {
		          if (ar1.get(i) == ar2.get(j))
		            k = 1;
		        }
		        if (k == 0)
		          l.add(ar1.get(i));
		      }
		      break;
		case '+':
			set.addAll(ar1);
	        set.addAll(ar2);
	        return new ArrayList(set);
		case '*': 
			
			 for (Integer t : ar1) {
		            if(ar2.contains(t)) {
		                l.add(t);
		            }
		        }

		        return l;
		        
		
		}
		return l;
	}

}

