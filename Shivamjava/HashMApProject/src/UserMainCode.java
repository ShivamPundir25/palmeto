import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UserMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size/or number of members:");
int size=sc.nextInt();
HashMap<Integer,String> hp1=new HashMap<Integer,String>();
HashMap<Integer,Integer> hp2=new HashMap<Integer,Integer>();

HashMap hp4=new HashMap();
System.out.println("Enter the details");
for(int i=1;i<=size;i++)
{
	System.out.println("Enter id of "+i);
	int id=sc.nextInt();
	System.out.println("Enter designation" +i);
	String designation=sc.next();
	System.out.println("Enter salary" +i);
	int salary=sc.nextInt();
	hp1.put(id, designation);
	hp2.put(id, salary);
	}
hp4=(HashMap) increaseSalaries(hp1,hp2);{}
	System.out.println(hp4);
	}

	private static Map increaseSalaries(HashMap<Integer, String> hp1, HashMap<Integer, Integer> hp2) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hp3=new HashMap<Integer,Integer>();
		
		/*	Set es1=hp1.entrySet();
		Iterator itr1=es1.iterator();
		
		Set es2=hp2.entrySet();
		Iterator itr2=es2.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry me1= (Map.Entry)itr1.next();
			String id=me1.getValue()
		}
		used when data is geeneric data-studne employee
		*/
		
		//use key sets when data is pre defined
		
		
		
		Set keys=hp1.keySet();
		Iterator itr=keys.iterator();
		
		while(itr.hasNext())
		{
			int id =(int)itr.next();
			String s=hp1.get(id);
			if(s.equals("manager"))
			{
				int newsal=hp2.get(id)+5000;
				hp3.put(id,newsal);
			}
		}
		
		return hp3;
	}

}

