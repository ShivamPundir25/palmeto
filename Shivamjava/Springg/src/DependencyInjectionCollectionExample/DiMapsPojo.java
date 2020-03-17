package DependencyInjectionCollectionExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DiMapsPojo {

private	int id;
private	String question;
private	Map<String,String> mp;

public DiMapsPojo(int id, String question, Map<String, String> mp) {
	super();
	this.id = id;
	this.question = question;
	this.mp = mp;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public Map<String, String> getMp() {
	return mp;
}

public void setMp(Map<String, String> mp) {
	this.mp = mp;
}

public void showAnswers() {
	System.out.println("Qid : " +id);
	System.out.println("Question : " +question);
    Set keys=mp.entrySet();
    Iterator itr=keys.iterator();
    while(itr.hasNext())
    {
    	Map.Entry e=(Map.Entry)itr.next();
    	System.out.println(e.getKey()+"    "+e.getValue());
    	}
}

//business logic above

}
