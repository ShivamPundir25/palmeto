package MapsExample;
import java.util.*;

public class HashCodeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> m=new HashMap<Integer,String>();
ArrayList<String> ar=new ArrayList<String>();
m.put(101, "Shivam");
m.put(102, "suryA");
m.put(103, "pundiR");
m.put(104, "HarI");
m.put(105, "singH");
m.put(106, "sundaR");
Set set=m.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
	Map.Entry entry=(Map.Entry)itr.next();
	String str=(String)entry.getValue();
	if(str.charAt(0)<=122 && str.charAt(0)>=97 && str.charAt(str.length()-1)<=90 && str.charAt(str.length()-1)>=65)
	{
	ar.add(str);
	}
	}
ar.forEach(System.out::println);
	}

}
