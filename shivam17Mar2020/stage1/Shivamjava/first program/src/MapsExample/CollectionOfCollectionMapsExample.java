package MapsExample;
import java.util.*;
public class CollectionOfCollectionMapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//arraylist
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(12);
al.add(22);
al.add(32);
al.add(42);
al.add(52);

// sets
TreeSet <String>ts=new TreeSet<String>();
ts.add("s");
ts.add("h");
ts.add("i");
ts.add("v");
ts.add("a");
ts.add("m");

//queue
PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
pq.add(98);
pq.add(97);
pq.add(96);
pq.add(95);
pq.add(94);
pq.add(93);
pq.add(92);
pq.add(91);
pq.add(90);

// hashmap
 Map<Integer,Collection> m=new HashMap<Integer,Collection>();
 m.put(1,al);
 m.put(2, ts);
 m.put(3, pq);
  Set set=m.entrySet();
  Iterator itr=set.iterator();
  
  while(itr.hasNext())
  {
	  Map.Entry map=(Map.Entry)itr.next();
	  Collection c=(Collection) map.getValue();
	  System.out.println(map.getKey());
	  System.out.println(c);
	 
  }
	}

}

