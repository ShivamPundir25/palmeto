package eventHandling;

public class TestBean {

private	String firstname;
private String lastname;


public TestBean()
{}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public void displayDetails() {
	// TODO Auto-generated method stub
	
	System.out.println(lastname+"  "+firstname);
}



}
