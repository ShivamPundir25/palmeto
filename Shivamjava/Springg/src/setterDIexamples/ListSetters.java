package setterDIexamples;

import java.util.Iterator;
import java.util.List;

public class ListSetters {
 private String name;
 private String id;
 private List<String> ans;
 
 

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public List<String> getAns() {
	return ans;
}

public void setAns(List<String> ans) {
	this.ans = ans;
}

public void showData() {
System.out.println("ID:   "+id +"Name : "+name);
Iterator itr=ans.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());	
}
}
 
 
 
}
