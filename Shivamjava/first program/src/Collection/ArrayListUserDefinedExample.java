package Collection;
import java.util.*;
public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("Shivam",1232);
Student s2=new Student("pratap",777);
Student s3=new Student("Sinmgh",888);
Student s4=new Student("pundir",999);
 ArrayList ar=new ArrayList();
 ar.add(s1);
 ar.add(s2);
 ar.add(s3);
 ar.add(s4);
 System.out.println(ar);
 Employee e1=new Employee("12","hari");
 Employee e2=new Employee("34","surya");
 ar.add(e1);
 ar.add(e2);
 System.out.println(ar);
	}

}
 class Student{
	 String name;
	 int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	 
 }
  class Employee{
	  String eid;
	  String name;
	public Employee(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	  
  }