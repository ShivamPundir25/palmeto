package ExceptionExamplesAssessment;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExampleEmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee emp1=new Employee("Durga","Ceo","Hyd",3000f);
 Employee emp2=new Employee("Sunil","Manager","Hyd",2000f);
 Employee emp3=new Employee("Surya","Maanger","bng",2000f);
 Employee emp4=new Employee("karan","Lead","Hyd",1500f);
 Employee emp5=new Employee("ksihore","Lead","bng",15000f);
 Employee emp6=new Employee("Shankar","Devops","Hyd",1000f);
 Employee emp7=new Employee("hari","Devops","Hyd",1000f);
 Employee emp8=new Employee("SunilKumnar","Devops","bng",1000f);
 
  Predicate<Employee> p1=emp->emp.designation.equals("Manager");
  Predicate<Employee> p2=emp->emp.city.equals("bng");
  Predicate<Employee> p3=emp->emp.salary<2000f;
  
  //create ArrayLISt to hold the user defined data type
  ArrayList<Employee> list=new ArrayList<Employee>();
 list.add(emp1);
 list.add(emp2);
 list.add(emp3);
 list.add(emp4);
 list.add(emp5);
 list.add(emp6);
 list.add(emp7);
 list.add(emp8);
 display(p2.and(p3),list);
 display(p1,list);
	}
	public static void display(Predicate<Employee> p,ArrayList<Employee> list)
	{
	for(Employee e:list)
	{
		if(p.test(e))
		{
			System.out.println(e);
		}
	}
	}

}

class Employee{
	String name,designation,city;
	Float salary;
	Employee(String name,String designation,String city,Float salary){
		super();
		this.name=name;
		this.designation=designation;
		this.city=city;
		this.salary=salary;
	}
	// overridden equals method
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if(designation.equals(e.designation) && name.equals(e.name) && city.equals(e.city) && salary.equals(e.salary))
		return true;
		else return false;
	}
	
	// overridden to string method
	@Override
	public String toString() {
	return "Employee [name=" + name + ", designation=" + designation + ", city=" + city + ", salary=" + salary
			+ "]";
}
	
	
}