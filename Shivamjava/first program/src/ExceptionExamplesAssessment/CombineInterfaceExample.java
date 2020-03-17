package ExceptionExamplesAssessment;
import java.util.function.*;
import java.util.ArrayList;
class Student2{
	 String name;
	 int marks;
	 Student2(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}
	 
}
public class CombineInterfaceExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Student2> list=new ArrayList<Student2>();
Student2 s1= new Student2("Ahri",34);
Student2 s2= new Student2("QUhri",35);
Student2 s3= new Student2("Shi",64);
Student2 s4= new Student2("hri",84);
Student2 s5= new Student2("Dsjbh",69);
list.add(s1);
list.add(s2);
list.add(s3);
list.add(s4);
list.add(s5);
Predicate<Student2> p=s->s.marks>=60;
System.out.println(p.test(s5));

Function<Student2,String> f=s->{
	int marks=s.marks;
	if(marks>=80)
		return "A[Distinction]";
	else if(marks>=70)
		return "B[1st Division]";
	else if(marks>=60)

		return "c[2nd Divisiobn]";
	else
		return "d[FAiled]";
	
};

Consumer<Student2> c=s->{
	System.out.println("Student name:"+s.name);
	System.out.println("Student name:"+s.marks);
	System.out.println("Student name:"+f.apply(s));
};

for(Student2 s:list)
{
	if(p.test(s))
		c.accept(s);
		}
	}

}
