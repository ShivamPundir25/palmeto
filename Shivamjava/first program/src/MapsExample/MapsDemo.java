package MapsExample;
import java.util.*;
public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put("k1", "India");
hm.put("k2", "Bangla");
hm.put("k3", "Bangla");
hm.put("k7", "UK");
hm.put("k4", "USa");
hm.put("k5", "UAE");
//hm.put("k6", "SriLAnka"); 
//Object obj=hm.put("k6", "SriLanka");
//System.out.println(obj);


hm.put("k6", "SHivam");
// if we use same key again then the first
//value will overridden with latest value
System.out.println(hm);

Set keys=hm.keySet();

Iterator itr=keys.iterator();
while(itr.hasNext()) System.out.println(itr.next());

Set entries=hm.entrySet();
Iterator itr1=keys.iterator();
while(itr1.hasNext()) {
	Map.Entry me=(Map.Entry)itr1.next();
	System.out.println(me.getKey()+ "   " +me.getValue());
	}


}}
