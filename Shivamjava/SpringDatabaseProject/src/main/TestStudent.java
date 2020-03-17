package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in); 
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");
		
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.update");
			System.out.println("4.showDetails");
			System.out.println("5.Quit");
			
		/*
//details to be entered in table
			System.out.println("Enter Student id: ");
			int id=sc.nextInt();
			System.out.println("Enter Student name: ");
			String name=sc.next();
			System.out.println("Enter Student age: ");
			int age=sc.nextInt();
			
			//create the student object and set value
			Student student =new Student();
			student.setId(id);
			student.setName(name);
			student.setAge(age);
			
			//call this method to add the values into table
			sdao.create(student);
	    */
		  
			
	   /*
//for deleting the data from table
			
			System.out.println("enter student id to be deleted");
			int dId=sc.nextInt();
			sdao.delete(dId);
		*/
			
			
/*			
//for updating the data in table
			//id to be updated 
			System.out.println("Enter Student to be updated  id: ");
			int id=sc.nextInt();
			
			// set new updated values in table
			System.out.println("update Student name: ");
			String name=sc.next();
			System.out.println("update Student  age: ");
			int age=sc.nextInt();
			
			//creating student data detaius to be updated
			Student student=new Student();
			student.setId(id);
			student.setName(name);
			student.setAge(age);
			
			//pass details in student object nd call update method
			sdao.update(student);
			
*/
		
	/*
//getting all students details
			List<Student> students=sdao.listStudents();
			for(Student s:students)
			{
				System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
			}
	*/	
		
	
//inseritng values dynamically
			/*
			Student e =new Student();
			
			
			System.out.println("Enter Student id: ");
			int id=sc.nextInt();
			System.out.println("Enter Student name: ");
			String name=sc.next();
			System.out.println("Enter Student age: ");
			int age=sc.nextInt();
			
			e.setId(id);
			e.setName(name);
			e.setAge(age);
			boolean count=sdao.saveStudentByPst(e);
			System.out.println(count+" inserted");
	*/		
			
	}

}
