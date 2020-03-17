import java.util.function.*;
public class BiFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction <String,String,Student3> bif=(name,htno)->new Student3(name,htno);
		Student3 s1=bif.apply("HAri","1234");
		Student3 s2=bif.apply("ishwar","567");
		System.out.println(s1.name+" "+s1.htno);
		System.out.println(s2); // hashcode if dont override the tostring method
 
	}

}
 class Student3{
	 String name;
	 String htno;
	public Student3(String name, String htno) {
		this.name = name;
		this.htno = htno;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", htno=" + htno + "]";
	}
	 
 }