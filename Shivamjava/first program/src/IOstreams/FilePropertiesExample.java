package IOstreams;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class FilePropertiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties prop=System.getProperties();
Set s=prop.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry entry=(Map.Entry)itr.next();
	System.out.println(entry.getKey()+"   "+entry.getValue() );
	}
	}

}
