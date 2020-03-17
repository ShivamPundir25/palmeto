import java.util.*;


public class ComparableInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("shivam",1232);
Student s2=new Student("aratap",1232);
Student s3=new Student("binmgh",888);
Student s4=new Student("pundir",999);
 ArrayList ar=new ArrayList();
 ar.add(s1);
 ar.add(s2);
 ar.add(s3);
 ar.add(s4);

 ar.forEach(System.out::println);
 System.out.println("Sorted order");
 Collections.sort(ar);
 ar.forEach(System.out::println);

 if(s1.equals(s2)) {
	 System.out.println("true");
 }
 else {
    System.out.println("false");
 }
	}

}
 class Student implements Comparable<Student>{
	 @Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		 if(name.compareTo(student.name)<0)
		return -1;
		 else if(name.compareTo(student.name)>0)
			 return 1;
		 else return 0;
	}
	String name;
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	public boolean equals(Student student) {
		/*if (this ==student )
			return true;
		if (student == null)
			return false;
		if (getClass() != student.getClass())
			return false;*/
		Student other = (Student) student;
				if (id != other.id)
			return false;
		return true;
	}
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