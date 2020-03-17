import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Std> tm=new TreeMap<Integer,Std>();
		Std s1=new Std("shivam","21","dbd");
		Std s2=new Std("ayush","23","ymg");
		Std s3=new Std("taknev","25","hyd");
		Std s4=new Std("hari","24","ap");
		Std s5=new Std("surya","24","guntoor");
		Std s6=new Std("chandu","26","moon");
		tm.put(1,s1);
		tm.put(2,s2);
		tm.put(3,s3);
		tm.put(4,s4);
		tm.put(5,s5);
		tm.put(6,s6);
		 Set set=tm.entrySet();
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
