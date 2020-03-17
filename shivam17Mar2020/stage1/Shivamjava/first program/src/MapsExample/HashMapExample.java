package MapsExample;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Map<String,Groups> m=new HashMap<String,Groups>();
m.put("JNTU",new Groups("CSE","ECE","EEE"));
m.put("SUV",new Groups("CSE","CIVIL","MECH"));
m.put("OU",new Groups("IT","ECE","CIVIL"));
m.put("AKTU",new Groups("CSE","ECE","IT"));
m.put("DTU",new Groups("MECH","ECE","CIVIL"));

Scanner sc=new Scanner(System.in);
System.out.println("Enter the department u r searching for");
String dept=sc.next();


Set entries=m.entrySet();
Iterator itr=entries.iterator();
System.out.println("college code who are offering"+dept+"are below");
while(itr.hasNext())
{
	Map.Entry me=(Map.Entry)itr.next();
	Groups i=(Groups)me.getValue();
	if(i.d1.equals(dept)||i.d2.equals(dept)||i.d3.equals(dept))
		System.out.println(me.getKey());
	}

	}

}
class Groups
{
	String d1,d2,d3;

	public Groups(String d1, String d2, String d3) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}

	@Override
	public String toString() {
		return "Groups [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	
	}
