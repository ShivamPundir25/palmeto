package demo;

public class MainClass1 {
 private String name; 
 private int id;
 private String company;

 //public MainClass1() {}

 public MainClass1( int a, String b) {
		
	}
 
public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}
 
 public void displayDetails()
 {
	 System.out.println("NAME :"+name);
	 System.out.println("ID :"+id);
	 System.out.println("COMP :"+company);
 }
 
}
