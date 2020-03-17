package ExceptionExamplesAssessment;
import java.util.function.Function;
public class FunctionInterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class Student{
	 String name;
	 int mark;
	 Student(String name,int mark)
	 { super();
		 this.name=name;
		 this.mark=mark;
	 }
	 
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		if(name.equals(s.name) && mark.equals(s.mark))
			return true;
		else return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
 }